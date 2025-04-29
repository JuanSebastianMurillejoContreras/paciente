package com.usuario.usuario.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_paciente")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @Column( length = 50)
    private String tipoIdentificacion;

    @Column(unique = true, length = 50)
    private String numeroIdentificacion;

    @Column( length = 50)
    private String primerNombre;

    @Column(length = 50)
    private String segundoNombre;

    @Column( length = 50)
    private String primerApellido;

    @Column(length = 50)
    private String segundoApellido;

    @Column()
    private LocalDate fechaNacimiento;

    @Column()
    private String sexo;

    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String telefono;

    @Column()
    private String aseguradora;

    @Column()
    private String usuarioGrabado;

    @Column()
    private LocalDateTime fechaHoraGrabado = LocalDateTime.now();

    @Column()
    private Integer activo;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    private PacienteComplementoEntity pacienteComplemento;

}
