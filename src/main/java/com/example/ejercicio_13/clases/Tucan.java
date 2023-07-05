package com.example.ejercicio_13.clases;

public class Tucan extends AnimalSalvaje {
    @Override
    public void reproducirSonido() {
        System.out.println("canto");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino y vuelo");
    }

    public Tucan(Reinos reino, Tipos tipo, String raza, Medios medio) {
        super(reino, tipo, raza, medio);
    }

}
