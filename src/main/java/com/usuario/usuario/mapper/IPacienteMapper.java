package com.usuario.usuario.mapper;


import com.usuario.usuario.dto.input.PacienteComplementoRequestDTO;
import com.usuario.usuario.dto.input.PacienteRequestDTO;
import com.usuario.usuario.dto.output.PacienteComplementoResponseDTO;
import com.usuario.usuario.dto.output.PacienteResponseDTO;
import com.usuario.usuario.entity.PacienteComplementoEntity;
import com.usuario.usuario.entity.PacienteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface IPacienteMapper {

    PacienteEntity pacienteRequestDTOToPacienteEntity(PacienteRequestDTO dto);

    PacienteResponseDTO pacienteEntityToPacienteResponseDto(PacienteEntity entity);

    PacienteComplementoEntity pacienteComplementoRequestDTOToPacienteComplementoEntity(PacienteComplementoRequestDTO dto);

    void updatePacienteEntityToPacienteRequestDTO(PacienteRequestDTO dto, @MappingTarget PacienteEntity entity);

}
