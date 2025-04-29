package com.usuario.usuario.dto.output;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteComplementoResponseDTO {

    private Long idPacienteComplemento;

    private String municipio;

    private String direccion;

    private String tipoZona;

    private LocalDate fechaAfiliacion;

    private String tipoPoblacion;

    private String tipoAfiliacion;

    private String tipoIdentificacionCotizante;

    private Integer numeroIdentificacionCotizante;

    private String tipoAfiliado;

    private String parentesco;

    private String nivelSisben;

    private String estadoCivil;

    private String empresa;

    private String nivelEducativo;

    private String ocupacion;

    private String nombreResponsable;

    private String telefonoResponsable;

    private String parentescoResponsable;

    private String cuotaModeradora;

    private String consecutivoOcupacion;

    private String consecutivoEtnia;

    private String celular;

    private String tipoDiscapacidad;

    private String comunidad;

    private String resguardo;

    private String swVictimaConflicto;

    private String urlSoporteVictimaConflicto;

    private String observacionAlergia;
}
