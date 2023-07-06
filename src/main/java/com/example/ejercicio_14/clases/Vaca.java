package com.example.ejercicio_14.clases;

public class Vaca extends AnimalGranja {
    public Vaca(String raza, Sexo sexo, String propietario) {
        super(Reino.MAMIFERO, Tipo.VACA, Medio.TERRESTRE, raza, sexo, propietario);
    }

    public Vaca(String raza, Sexo sexo, String propietario, AnimalGranja padre, AnimalGranja madre) {
        super(Reino.MAMIFERO, Tipo.VACA, Medio.TERRESTRE, raza, sexo, propietario, padre, madre);
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
