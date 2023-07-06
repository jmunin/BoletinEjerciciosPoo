package com.example.ejercicio_13.clases;

public class Tucan extends AnimalSalvaje {
    public Tucan(String raza, Sexo sexo) {
        super(Reino.AVE, Tipo.TUCAN, Medio.AEREO, raza, sexo);
    }

    public Tucan(String raza, Sexo sexo, AnimalSalvaje padre, AnimalSalvaje madre) {
        super(Reino.AVE, Tipo.TUCAN, Medio.AEREO, raza, sexo, padre, madre);
    }

    public Tucan(String raza) {
        super(Reino.AVE, Tipo.TUCAN, Medio.AEREO, raza, Sexo.MACHO);
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
