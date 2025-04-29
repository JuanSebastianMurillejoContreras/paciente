package com.usuario.usuario.dto.input;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteComplementoRequestDTO {

    private Long idPacienteComplemento;

    // Ubicación
    @NotBlank(message = "El municipio no puede estar vacío ni contener solo espacios")
    @Size(max = 50, message = "El municipio no puede exceder los 50 caracteres")
    private String municipio;
    @NotBlank(message = "La direccion no puede estar vacío ni contener solo espacios")
    private String direccion;
    @NotBlank(message = "El tipoZona no puede estar vacío ni contener solo espacios")
    private String tipoZona;

    // Afiliación
    private LocalDate fechaAfiliacion;
    private String tipoPoblacion;
    private String tipoAfiliacion;
    private String tipoIdentificacionCotizante;
    private String numeroIdentificacionCotizante;
    private String tipoAfiliado;
    private String parentesco;
    private String nivelSisben;
    private String estadoCivil;

    // Información laboral y educativa
    private String empresa;
    private String nivelEducativo;
    private String ocupacion;
    private String consecutivoOcupacion;

    // Datos del responsable
    private String nombreResponsable;
    private String telefonoResponsable;
    private String parentescoResponsable;

    // Datos adicionales
    private String cuotaModeradora;
    private String consecutivoEtnia;
    private String celular;
    private String tipoDiscapacidad;
    private String comunidad;
    private String resguardo;
    private String swVictimaConflicto;
    private String urlSoporteVictimaConflicto;
    private String observacionAlergia;
}
