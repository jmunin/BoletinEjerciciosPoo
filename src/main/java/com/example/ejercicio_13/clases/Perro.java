package com.example.ejercicio_13.clases;

public class Perro extends Mascota {
    public Perro(String raza, Sexo sexo, String nombre, String propietario) {
        super(Reino.MAMIFERO, Tipo.PERRO, Medio.TERRESTRE, raza, sexo, nombre, propietario);
    }

    public Perro(String raza, Sexo sexo, String nombre, String propietario, Mascota padre, Mascota madre) {
        super(Reino.MAMIFERO, Tipo.PERRO, Medio.TERRESTRE, raza, sexo, nombre, propietario, padre, madre);
    }

    public Perro(int id, String raza, Sexo sexo, String nombre, String propietario, Mascota padre, Mascota madre) {
        super(id, Reino.MAMIFERO, Tipo.PERRO, Medio.TERRESTRE, raza, sexo, nombre, propietario, padre, madre);
    }

    public Perro(String raza, String nombre, String propietario) {
        super(Reino.MAMIFERO, Tipo.PERRO, Medio.TERRESTRE, raza, Sexo.MACHO, nombre, propietario);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("guau");
    }

    @Override
    public void desplazarse() {
        System.out.println("Camino, corro o salto");
    }
}
