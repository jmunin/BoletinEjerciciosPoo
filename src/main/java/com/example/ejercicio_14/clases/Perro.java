package com.example.ejercicio_14.clases;

public class Perro extends Mascota {
    public Perro(Reinos reino, Tipos tipo, String raza, Medios medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("guau");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino, corro o salto");
    }
}
