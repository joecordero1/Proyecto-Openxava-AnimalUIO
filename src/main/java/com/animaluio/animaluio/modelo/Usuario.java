package com.animaluio.animaluio.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "rol", discriminatorType = DiscriminatorType.STRING)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUsuario;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, unique = true, nullable = false)
    private String correo;

    @Column(length = 20, nullable = false)
    private String rol;

    public void login(String correo) {
        System.out.println("Usuario con correo " + correo + " inició sesión.");
    }

    public abstract void gestionarUsuarios();

    public abstract void verReportes();
}

