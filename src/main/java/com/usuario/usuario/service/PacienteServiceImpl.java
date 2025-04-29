package com.usuario.usuario.service;

import com.usuario.usuario.dto.input.PacienteRequestDTO;
import com.usuario.usuario.dto.output.PacienteResponseDTO;
import com.usuario.usuario.entity.PacienteComplementoEntity;
import com.usuario.usuario.entity.PacienteEntity;
import com.usuario.usuario.exception.ModelNotFoundException;
import com.usuario.usuario.mapper.IPacienteMapper;
import com.usuario.usuario.repo.IPacienteRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PacienteServiceImpl implements IPacienteService{

    private final IPacienteRepo pacienteRepo;
    private final IPacienteMapper pacienteMapper;

    @Value("${properties.messages.error.paciente-does-not-exist}")
    private String pacienteDoesntExistError;

    @Override
    @Transactional
    public PacienteResponseDTO createPaciente(PacienteRequestDTO pacienteRequestDTO){

        PacienteEntity pacienteEntity = pacienteMapper.pacienteRequestDTOToPacienteEntity(pacienteRequestDTO);
        PacienteComplementoEntity pacienteComplementoEntity = pacienteMapper.pacienteComplementoRequestDTOToPacienteComplementoEntity(pacienteRequestDTO.getPacienteComplemento());

        pacienteComplementoEntity.setPaciente(pacienteEntity);
        pacienteEntity.setPacienteComplemento(pacienteComplementoEntity);

        PacienteEntity savedPaciente = pacienteRepo.save(pacienteEntity);

        return pacienteMapper.pacienteEntityToPacienteResponseDto(savedPaciente);
    }


    @Override
    @Transactional
    public PacienteResponseDTO updatePaciente(PacienteRequestDTO pacienteRequestDTO, Long id) {

        PacienteEntity updatePaciente = pacienteRepo.findById(id)
                .orElseThrow(() -> new ModelNotFoundException(pacienteDoesntExistError));

        pacienteMapper.updatePacienteEntityToPacienteRequestDTO(pacienteRequestDTO, updatePaciente);

        PacienteComplementoEntity pacienteComplementoEntity = pacienteMapper
                .pacienteComplementoRequestDTOToPacienteComplementoEntity(pacienteRequestDTO.getPacienteComplemento());

        pacienteComplementoEntity.setIdPacienteComplemento(updatePaciente.getPacienteComplemento().getIdPacienteComplemento());
        pacienteComplementoEntity.setPaciente(updatePaciente);
        updatePaciente.setPacienteComplemento(pacienteComplementoEntity);

        return pacienteMapper.pacienteEntityToPacienteResponseDto(pacienteRepo.save(updatePaciente));
    }

    @Override
    public List<PacienteResponseDTO> getAllPacienteEntitys() {
        List<PacienteEntity> pacienteEntityList = pacienteRepo.findAll();
        return pacienteEntityList.stream().map(pacienteMapper::pacienteEntityToPacienteResponseDto).collect(Collectors.toList());
    }

    @Override
    public PacienteResponseDTO getPacienteEntityById(Long id) {
        PacienteEntity pacienteEntity = pacienteRepo.findById(id)
                        .orElseThrow(()-> new ModelNotFoundException(pacienteDoesntExistError));
        return pacienteMapper.pacienteEntityToPacienteResponseDto(pacienteEntity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        pacienteRepo.findById(id).orElseThrow(()-> new ModelNotFoundException(pacienteDoesntExistError));
        pacienteRepo.deleteById(id);
    }
}
