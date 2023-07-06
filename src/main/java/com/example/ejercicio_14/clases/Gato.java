package com.example.ejercicio_14.clases;

public class Gato extends Mascota {
    public Gato(String raza, Sexo sexo, String nombre, String propietario) {
        super(Reino.MAMIFERO, Tipo.GATO, Medio.TERRESTRE, raza, sexo, nombre, propietario);
    }

    public Gato(String raza, Sexo sexo, String nombre, String propietario, Mascota padre, Mascota madre) {
        super(Reino.MAMIFERO, Tipo.GATO, Medio.TERRESTRE, raza, sexo, nombre, propietario, padre, madre);
    }

    public Gato(Gato gato) {
        super(gato);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("miau");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino, corro o salto");
    }

}

