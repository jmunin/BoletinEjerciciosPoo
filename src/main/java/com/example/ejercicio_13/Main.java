package com.example.ejercicio_13;

/*
13. En un nuevo paquete. Convertir la clase Animal, en abstracta. Esta clase tiene los
métodos abstractos reproducir sonido, y desplazarse que imprimirá por consola el
sonido y el método de desplazamiento de cada animal.
*/

import com.example.ejercicio_13.clases.*;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato(Animal.Reinos.mamifero, Animal.Tipos.gato, "siamés", Animal.Medios.terrestre, "misifú","pepe");
        System.out.println(gato.toString());
        gato.reproducirSonido();
        gato.desplazarse();
        Perro perro = new Perro(Animal.Reinos.mamifero, Animal.Tipos.perro, "pastor", Animal.Medios.terrestre, "troski","pepe");
        System.out.println(perro.toString());
        perro.reproducirSonido();
        perro.desplazarse();
        Tucan tucan = new Tucan(Animal.Reinos.ave, Animal.Tipos.tucan, "andino", Animal.Medios.aereo);
        System.out.println(tucan.toString());
        tucan.reproducirSonido();
        tucan.desplazarse();
    }

}