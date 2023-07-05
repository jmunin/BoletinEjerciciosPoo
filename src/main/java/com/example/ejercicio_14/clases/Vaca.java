package com.example.ejercicio_14.clases;

public class Vaca extends AnimalGranja {
    public Vaca(Reinos reino, Tipos tipo, String raza, Medios medio, ISexual.Sexo sexo, String propietario) {
        super(reino, tipo, raza, medio, sexo, propietario);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("muuuuuuu");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino, corro o salto");
    }
}
