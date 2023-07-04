package com.example.ejercicio_11;

/*
11. Crear la clase mascota y animal de granja que implementen una interfaz que obligue
a ambas clases a implementar el método getPropietario y setPropietario. Las
mascotas tienen nombre mientras que los animales de granja no.
*/

import com.example.ejercicio_10.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(Animal.Reinos.mamifero, Animal.Tipos.gato, "común", Animal.Medios.terrestre);
        System.out.println(animal.toString());
        Animal mascota = new Mascota(animal, "misifú","pepe");
        System.out.println(mascota.toString());
        Animal animalGranja = new AnimalGranja(animal,"antonio");
        System.out.println(animalGranja.toString());
    }

}