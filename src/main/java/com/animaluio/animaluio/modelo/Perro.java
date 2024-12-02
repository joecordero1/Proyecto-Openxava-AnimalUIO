package com.animaluio.animaluio.modelo;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Perro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer edad;

    @Column(length = 100, nullable = false)
    private String ubicacion;

    @Column(length = 50, nullable = false)
    private String estadoSalud;

    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    public void registrar(String nombre, Integer edad, String ubicacion, String estadoSalud, Date fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.ubicacion = ubicacion;
        this.estadoSalud = estadoSalud;
        this.fechaIngreso = fechaIngreso;
    }

    public void actualizarEstadoSalud(String nuevoEstado) {
        this.estadoSalud = nuevoEstado;
    }

    public boolean getAdoptable() {
        return "Saludable".equalsIgnoreCase(this.estadoSalud);
    }
}
