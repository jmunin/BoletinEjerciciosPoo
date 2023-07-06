package com.example.ejercicio_13.clases;

public class Oveja extends AnimalGranja {
    public Oveja(String raza, Sexo sexo, String propietario) {
        super(Reino.MAMIFERO, Tipo.OVEJA, Medio.TERRESTRE, raza, sexo, propietario);
    }

    public Oveja(String raza, Sexo sexo, String propietario, AnimalGranja padre, AnimalGranja madre) {
        super(Reino.MAMIFERO, Tipo.OVEJA, Medio.TERRESTRE, raza, sexo, propietario, padre, madre);
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
