package com.example.ejercicio_14.clases;

public class Tucan extends AnimalSalvaje {
    public Tucan(Reinos reino, Tipos tipo, String raza, Medios medio, ISexual.Sexo sexo) {
        super(reino, tipo, raza, medio, sexo);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("canto");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino y vuelo");
    }

}
