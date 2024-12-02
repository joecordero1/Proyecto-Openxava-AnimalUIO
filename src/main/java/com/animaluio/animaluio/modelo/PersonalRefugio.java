package com.animaluio.animaluio.modelo;

import javax.persistence.*;

@Entity
@DiscriminatorValue("PersonalRefugio")
public class PersonalRefugio extends Usuario {

    @Override
    public void gestionarUsuarios() {
        throw new UnsupportedOperationException("Solo los administradores pueden gestionar usuarios.");
    }

    @Override
    public void verReportes() {
        System.out.println("Accediendo a reportes básicos...");
    }
}
