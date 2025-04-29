package com.usuario.usuario.dto.input;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteRequestDTO {

    private Long idPaciente;

    @NotBlank(message = "El tipo de identificación no puede estar vacío ni contener solo espacios")
    @Size(max = 10, message = "El tipo de identificación no puede exceder 10 caracteres")
    private String tipoIdentificacion;

    @NotBlank(message = "El número de identificación no puede estar vacío ni contener solo espacios")
    @Size(max = 20, message = "El número de identificación no puede exceder 20 caracteres")
    private String numeroIdentificacion;

    @NotBlank(message = "El primer nombre no puede estar vacío ni contener solo espacios")
    @Size(max = 50, message = "El primer nombre no puede exceder 50 caracteres")
    private String primerNombre;

    private String segundoNombre;

    @NotBlank(message = "El primer apellido no puede estar vacío ni contener solo espacios")
    @Size(max = 50, message = "El primer apellido no puede exceder 50 caracteres")
    private String primerApellido;

    private String segundoApellido;

    @NotNull(message = "La fecha de nacimiento no puede ser nula")
    private LocalDate fechaNacimiento;

    @NotBlank(message = "El sexo no puede estar vacío ni contener solo espacios")
    private String sexo;

    @Email(message = "El correo electrónico debe tener un formato válido")
    private String email;

    @NotBlank(message = "El teléfono no puede estar vacío ni contener solo espacios")
    private String telefono;

    @NotBlank(message = "La aseguradora no puede estar vacía ni contener solo espacios")
    private String aseguradora;

    private String usuarioGrabado;

    @NotNull(message = "El estado de actividad no puede ser nulo")
    private String activo; // Cambié a Boolean si es un estado activo/desactivado

    @NotNull(message = "El complemento del paciente es obligatorio")
    private PacienteComplementoRequestDTO pacienteComplemento;

}
