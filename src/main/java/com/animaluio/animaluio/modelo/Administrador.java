package com.animaluio.animaluio.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Administrador")
public class Administrador extends Usuario {

    @Override
    public void gestionarUsuarios() {
        System.out.println("Gestionando usuarios del sistema...");
    }

    @Override
    public void verReportes() {
        System.out.println("Accediendo a todos los reportes disponibles...");
    }
}

