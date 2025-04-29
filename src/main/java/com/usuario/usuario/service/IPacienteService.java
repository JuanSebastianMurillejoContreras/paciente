package com.usuario.usuario.service;

import com.usuario.usuario.dto.input.PacienteRequestDTO;
import com.usuario.usuario.dto.output.PacienteResponseDTO;

import java.util.List;

public interface IPacienteService {

    PacienteResponseDTO createPaciente(PacienteRequestDTO pacienteRequestDTO) ;
    PacienteResponseDTO updatePaciente(PacienteRequestDTO pacienteRequestDTO, Long id) ;
    List<PacienteResponseDTO> getAllPacienteEntitys();
    PacienteResponseDTO getPacienteEntityById(Long id);
    void deleteById(Long id);

}
