package com.example.ejercicio_13.clases;

public class Gato extends Mascota {
    public Gato(Reinos reino, Tipos tipo, String raza, Medios medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("miau");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino, corro o salto");
    }
}
