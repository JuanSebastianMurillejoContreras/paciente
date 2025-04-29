package com.usuario.usuario.dto.output;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteResponseDTO {

    private Long idPaciente;

    private String tipoIdentificacion;

    private String numeroIdentificacion;

    private String primerNombre;

    private String segundoNombre;

    private String primerApellido;

    private String segundoApellido;

    private LocalDate fechaNacimiento;

    private String sexo;

    private String email;

    private String telefono;

    private String aseguradora;

    private String usuarioGrabado;

    private LocalDateTime fechaHoraGrabado;

    private Integer activo;

    private PacienteComplementoResponseDTO pacienteComplemento;

}
