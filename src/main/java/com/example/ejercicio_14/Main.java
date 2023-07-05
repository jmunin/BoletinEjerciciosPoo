package com.example.ejercicio_14;

/*
14. Crear una lista de animales que contenga una pareja de cada especie. Se tendrán en
cuenta las especies creadas anteriormente. Para esto los animales deben
implementar a interfaz ISexual, que define los métodos que dotan a un animal de
sexo.
*/

import com.example.ejercicio_14.clases.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //test();
        List<Animal> lista = new ArrayList<>();
        cargarListaAnimales(lista);
        test(lista);
    }

    public static void cargarListaAnimales(List<Animal> lista) {
        Animal animalMacho;
        Animal animalHembra;

        animalMacho = new Gato("siamés", ISexual.Sexo.MACHO, "misifu", "pepe");
        lista.add(animalMacho);
        animalHembra = new Gato("persa", ISexual.Sexo.HEMBRA, "lola", "pepe");
        lista.add(animalHembra);

        animalMacho = new Perro("pastor", ISexual.Sexo.MACHO, "troski", "pepe");
        lista.add(animalMacho);
        animalHembra = new Perro("dogo", ISexual.Sexo.HEMBRA, "chula", "pepe");
        lista.add(animalHembra);

        animalMacho = new Tucan("andino", ISexual.Sexo.MACHO);
        lista.add(animalMacho);
        animalHembra = new Tucan("texel", ISexual.Sexo.HEMBRA);
        lista.add(animalHembra);

        animalMacho = new Oveja("dorset", ISexual.Sexo.MACHO, "pepe");
        lista.add(animalMacho);
        animalHembra = new Oveja("sarda", ISexual.Sexo.HEMBRA, "pepe");
        lista.add(animalHembra);

        animalMacho = new Vaca("rubia gallega", ISexual.Sexo.MACHO, "pepe");
        lista.add(animalMacho);
        animalHembra = new Vaca("charolesa", ISexual.Sexo.HEMBRA, "pepe");
        lista.add(animalHembra);

        animalMacho = new PezPayaso("percula", ISexual.Sexo.MACHO);
        lista.add(animalMacho);
        animalHembra = new PezPayaso("ocellaris", ISexual.Sexo.HEMBRA);
        lista.add(animalHembra);
    }

    private static void test(List<Animal> lista) {
        System.out.printf("Número de elementos de la lista: %d\n", lista.size());
        for (Animal a :
                lista) {
            System.out.println(a.toString());
            a.reproducirSonido();
            a.desplazarse();
        }
    }

}