package com.example.ejercicio_12;

/*
12. Implementar las siguientes clases que hereden de la clase Animal. Cada una de ellas
debe heredar de la clase mascota, animal de granja o animal salvaje.
a. Perro.
b. Gato.
c. Tucán.
d. Pez payaso.
e. Vaca
f. Oveja

*/

import com.example.ejercicio_10.clases.Animal;
import com.example.ejercicio_12.clases.*;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(Animal.Reinos.mamifero, Animal.Tipos.gato, "común", Animal.Medios.terrestre);
        System.out.println(animal.toString());
        Animal gato = new Gato(animal, "misifú","pepe");
        System.out.println(gato.toString());
        Animal perro = new Perro(Animal.Reinos.mamifero, Animal.Tipos.perro, "pastor", Animal.Medios.terrestre, "troski","pepe");
        System.out.println(perro.toString());

        Animal tucan = new Tucan(Animal.Reinos.ave, Animal.Tipos.tucan, "común", Animal.Medios.aereo);
        System.out.println(tucan.toString());
        Animal pezPayaso = new PezPayaso(Animal.Reinos.pez, Animal.Tipos.pezPayaso, "común", Animal.Medios.acuatico);
        System.out.println(pezPayaso.toString());
        Animal vaca = new Vaca(Animal.Reinos.mamifero, Animal.Tipos.Vaca, "común", Animal.Medios.terrestre, "manolo");
        System.out.println(vaca.toString());
        Animal oveja = new Oveja(Animal.Reinos.mamifero, Animal.Tipos.Oveja, "común", Animal.Medios.terrestre, "manolo");
        System.out.println(oveja.toString());

    }

}