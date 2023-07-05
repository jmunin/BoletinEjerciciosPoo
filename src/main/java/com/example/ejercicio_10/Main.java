package com.example.ejercicio_10;

/*
10. Implementar en la clase animal un constructor de copia y el método clone.
*/

import com.example.ejercicio_09.clases.Animal;

public class Main {
    public static void main(String[] args) {
        com.example.ejercicio_10.clases.Animal animal1 = new com.example.ejercicio_10.clases.Animal(Animal.Reinos.mamifero, Animal.Tipos.gato, "común", Animal.Medios.terrestre);
        System.out.println(animal1.toString());
        com.example.ejercicio_10.clases.Animal animal2 = new com.example.ejercicio_10.clases.Animal(animal1);
        System.out.println(animal2.toString());
        com.example.ejercicio_10.clases.Animal animal3 = (com.example.ejercicio_10.clases.Animal)animal2.clone();
        System.out.println(animal3.toString());
    }

}