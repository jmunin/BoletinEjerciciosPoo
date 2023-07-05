package com.example.ejercicio_14.clases;

public class Gato extends Mascota {
    public Gato(Reinos reino, Tipos tipo, String raza, Medios medio, ISexual.Sexo sexo, String nombre, String propietario) {
        super(reino, tipo, raza, medio, sexo, nombre, propietario);
    }
    public Gato(Gato gato) {
        super(gato);
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
