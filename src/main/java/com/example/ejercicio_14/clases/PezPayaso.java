package com.example.ejercicio_14.clases;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(Reinos reino, Tipos tipo, String raza, Medios medio) {
        super(reino, tipo, raza, medio);
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
