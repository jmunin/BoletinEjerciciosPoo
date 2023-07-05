package com.example.ejercicio_14.clases;

public class Oveja extends AnimalGranja {
    public Oveja(String raza, ISexual.Sexo sexo, String propietario) {
        super(Reino.MAMIFERO, Tipo.OVEJA, Medio.TERRESTRE, raza, sexo, propietario);
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
