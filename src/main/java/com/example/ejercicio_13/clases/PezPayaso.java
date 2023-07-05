package com.example.ejercicio_13.clases;

public class PezPayaso extends AnimalSalvaje {
    @Override
    public void reproducirSonido() {
        System.out.println("glu glu");
    }

    @Override
    public void desplazarse() {
        System.out.println("Nado");
    }

    public PezPayaso(Reinos reino, Tipos tipo, String raza, Medios medio) {
        super(reino, tipo, raza, medio);
    }

}
