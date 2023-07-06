package com.example.ejercicio_13;

/*
13. En un nuevo paquete. Convertir la clase Animal, en abstracta. Esta clase tiene los
métodos abstractos reproducir sonido, y desplazarse que imprimirá por consola el
sonido y el método de desplazamiento de cada animal.
*/

import com.example.ejercicio_13.clases.*;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("siamés", "misifú", "pepe");
        System.out.println(gato.toString());
        gato.reproducirSonido();
        gato.desplazarse();
        Perro perro = new Perro("pastor", "troski", "pepe");
        System.out.println(perro.toString());
        perro.reproducirSonido();
        perro.desplazarse();
        Tucan tucan = new Tucan("andino");
        System.out.println(tucan.toString());
        tucan.reproducirSonido();
        tucan.desplazarse();
        Vaca vaca = new Vaca("rubia gallega", "pepe");
        System.out.println(vaca.toString());
        vaca.reproducirSonido();
        vaca.desplazarse();
    }

}