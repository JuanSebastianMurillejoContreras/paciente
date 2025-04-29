package com.usuario.usuario.controller;

import com.usuario.usuario.dto.input.PacienteRequestDTO;
import com.usuario.usuario.dto.output.PacienteResponseDTO;
import com.usuario.usuario.service.IPacienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PacienteController {

    private final IPacienteService pacienteService;

    @PostMapping("/paciente")
    @ResponseStatus(HttpStatus.CREATED)
    public PacienteResponseDTO createPaciente (@RequestBody @Valid PacienteRequestDTO pacienteRequestDTO) {
        return pacienteService.createPaciente(pacienteRequestDTO);
    }

    @GetMapping("/pacientes")
    @ResponseStatus(HttpStatus.OK)
    public List<PacienteResponseDTO> getAllPacientes() {
        return pacienteService.getAllPacienteEntitys();
    }

    @GetMapping("/paciente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public PacienteResponseDTO getPacienteById(@PathVariable Long id) {
        return pacienteService.getPacienteEntityById(id);
    }

    @PutMapping("/paciente/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public PacienteResponseDTO updatePaciente(@RequestBody @Valid PacienteRequestDTO pacienteRequestDTO, @PathVariable Long id) {
        return pacienteService.updatePaciente(pacienteRequestDTO, id);
    }

    @DeleteMapping("/paciete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePaciente(@Valid Long id) {
        pacienteService.deleteById(id);
    }

}
