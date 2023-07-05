package com.example.ejercicio_14.clases;

public class Tucan extends AnimalSalvaje {
    public Tucan(String raza, ISexual.Sexo sexo) {
        //
        super(Reino.AVE, Tipo.TUCAN, Medio.AEREO, raza, sexo);
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
