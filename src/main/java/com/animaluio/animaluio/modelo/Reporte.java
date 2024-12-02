package com.animaluio.animaluio.modelo;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idReporte;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(length = 50, nullable = false)
    private String tipo;

    @ManyToOne
    private Perro perro;

    public String generarReporte() {
        return "Reporte de tipo '" + tipo + "' generado para el perro " + (perro != null ? perro.getNombre() : "desconocido");
    }

    public String exportarReporte(String formato) {
        return "Reporte exportado en formato " + formato;
    }
}
