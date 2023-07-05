package com.example.ejercicio_14.clases;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(Reinos reino, Tipos tipo, String raza, Medios medio, ISexual.Sexo sexo) {
        super(reino, tipo, raza, medio, sexo);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("glu glu");
    }

    @Override
    public void desplazarse() {
        System.out.println("Nado");
    }

}
