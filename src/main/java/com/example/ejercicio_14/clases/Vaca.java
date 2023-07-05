package com.example.ejercicio_14.clases;

public class Vaca extends AnimalGranja {
    public Vaca(String raza, ISexual.Sexo sexo, String propietario) {
        super(Reino.MAMIFERO, Tipo.VACA, Medio.TERRESTRE, raza, sexo, propietario);
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
