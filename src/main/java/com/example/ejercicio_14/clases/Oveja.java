package com.example.ejercicio_14.clases;

public class Oveja extends AnimalGranja {
    public Oveja(Reinos reino, Tipos tipo, String raza, Medios medio, ISexual.Sexo sexo, String propietario) {
        super(reino, tipo, raza, medio, sexo, propietario);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("beeeeee");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino, corro o salto");
    }
}
