package com.example.ejercicio_09;

/*
9. Crear una clase animal que implemente los atributos:
a. Reino: mamífero, ave...
b. Tipo: gato, periquito...
c. Raza.
d. Medio: acuático, aéreo
e. .toString().
*/

import com.example.ejercicio_09.clases.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Animal(Animal.Reinos.mamifero, Animal.Tipos.gato, "común", Animal.Medios.terrestre).toString());
    }

}