package com.animaluio.animaluio.modelo;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Adopcion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAdopcion;

    @Temporal(TemporalType.DATE)
    private Date fechaAdopcion;

    @ManyToOne(optional = false)
    private Perro perro;

    @ManyToOne(optional = false)
    private Usuario adoptante;

    public void registrarAdopcion(Perro perro, Usuario adoptante, Date fechaAdopcion) {
        this.perro = perro;
        this.adoptante = adoptante;
        this.fechaAdopcion = fechaAdopcion;
        System.out.println("Adopción registrada para el perro " + perro.getNombre() + " por el usuario " + adoptante.getNombre());
    }

    public String generarContrato() {
        return "Contrato de adopción generado para el perro " + perro.getNombre() + " adoptado por " + adoptante.getNombre();
    }
}
