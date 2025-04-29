package com.usuario.usuario.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_paciente_complemento")
public class PacienteComplementoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPacienteComplemento;

    @OneToOne
    @JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_PACIENTE_COMPLEMENTO_PACIENTE"))
    private PacienteEntity paciente;

    @Column(nullable = false)
    private String municipio;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String tipoZona;

    @Column(nullable = false)
    private LocalDate fechaAfiliacion;

    @Column(nullable = false)
    private String tipoPoblacion;

    @Column(nullable = false)
    private String tipoAfiliacion;

    @Column(nullable = false)
    private String tipoIdentificacionCotizante;

    @Column(nullable = false)
    private Integer numeroIdentificacionCotizante;

    @Column(nullable = false)
    private String tipoAfiliado;

    @Column(nullable = false)
    private String parentesco;

    @Column(nullable = false)
    private String nivelSisben;

    @Column(nullable = false)
    private String estadoCivil;

    @Column(nullable = false)
    private String empresa;

    @Column(nullable = false)
    private String nivelEducativo;

    @Column(nullable = false)
    private String ocupacion;

    @Column(nullable = false)
    private String nombreResponsable;

    @Column(nullable = false)
    private String telefonoResponsable;

    @Column(nullable = false)
    private String parentescoResponsable;

    @Column(nullable = false)
    private String cuotaModeradora;

    @Column(nullable = false)
    private String consecutivoOcupacion;

    @Column(nullable = false)
    private String consecutivoEtnia;

    @Column(nullable = false)
    private String celular;

    @Column(nullable = false)
    private String tipoDiscapacidad;

    @Column(nullable = false)
    private String comunidad;

    @Column(nullable = false)
    private String resguardo;

    @Column(nullable = false)
    private String swVictimaConflicto;

    @Column(nullable = false)
    private String urlSoporteVictimaConflicto;

    @Column(nullable = false)
    private String observacionAlergia;

}
