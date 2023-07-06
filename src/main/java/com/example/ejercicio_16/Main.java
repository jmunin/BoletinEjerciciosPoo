package com.example.ejercicio_16;

import com.example.ejercicio_14.clases.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
16. Hacer una nueva lista de animales. Si en esta lista de animales existen 2 de la misma
especie estos dos tendrán una cría.
a. Iterar este proceso hasta que el número de animales deje de crecer.
b. Cada pareja puede tener un máximo de 3 crías.
c. Ningún animal puede criar con sus padres o hermanos.
*/
public class Main {
    private static final int MAX_GENERACIONES = 3;

    public static void main(String[] args) {
        List<Animal> lista = new ArrayList<>();
        cargarListaAnimales(lista);
        System.out.printf("Número de elementos iniciales de la lista es %d\n", lista.size());
        System.out.printf("Número máximo de crías por pareja: %d\n", Animal.MAX_CRIAS);
        System.out.printf("Número máximo de generaciones calculadas: %d\n", MAX_GENERACIONES);

        for(int i = 0; i < MAX_GENERACIONES; i++) {
            System.out.printf("%d generación:\n", i + 1);
            lista = reproduccion(lista);
            System.out.printf("Número total de elementos de la lista al final de la %d generación es %d\n", i + 1, lista.size());
            //test(lista);
        }
        //test(lista);
    }
    public static void cargarListaAnimales(List<Animal> lista) {
        Animal animalMacho, animalHembra;

        animalMacho = new Gato("siamés", Sexo.MACHO, "misifu", "pepe");
        lista.add(animalMacho);
        animalHembra = new Gato("persa", Sexo.HEMBRA, "lola", "pepe");
        lista.add(animalHembra);
        animalHembra = new Gato("persa", Sexo.HEMBRA, "rigoberta", "pepe");
        lista.add(animalHembra);

        animalMacho = new Perro("pastor", Sexo.MACHO, "troski", "pepe");
        lista.add(animalMacho);
        animalMacho = new Perro("boxer", Sexo.MACHO, "patoso", "pepe");
        lista.add(animalMacho);
        animalHembra = new Perro("dogo", Sexo.HEMBRA, "patosa", "pepe");
        lista.add(animalHembra);

        animalMacho = new Tucan("andino", Sexo.MACHO);
        lista.add(animalMacho);
        animalHembra = new Tucan("texel", Sexo.HEMBRA);
        lista.add(animalHembra);

        animalMacho = new Oveja("dorset", Sexo.MACHO, "pepe");
        lista.add(animalMacho);
        animalHembra = new Oveja("sarda", Sexo.HEMBRA, "pepe");
        lista.add(animalHembra);

        animalMacho = new Vaca("rubia gallega", Sexo.MACHO, "pepe");
        lista.add(animalMacho);
        animalHembra = new Vaca("charolesa", Sexo.HEMBRA, "pepe");
        lista.add(animalHembra);

        animalMacho = new PezPayaso("percula", Sexo.MACHO);
        lista.add(animalMacho);
        animalHembra = new PezPayaso("ocellaris", Sexo.HEMBRA);
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

    private static List<Animal> reproduccion(List<Animal> listaProgenitores) {
        List<Animal> listaCompleta = new ArrayList<>(listaProgenitores);
        //List<Animal> listaMachos = listaProgenitores.stream().filter(x -> x.getSexo()== ISexual.Sexo.MACHO).collect(Collectors.toList());
        //List<Animal> listaHembras = listaProgenitores.stream().filter(x -> x.getSexo()== ISexual.Sexo.HEMBRA).collect(Collectors.toList());
        for (Animal a : listaProgenitores) {
            if (a.getSexo() == Sexo.MACHO) {
                // Cojo los machos
                for (Animal b : listaProgenitores) {
                    //cojo las hembras
                    if (b.getSexo()== Sexo.HEMBRA) {
                        if (a.puedeCriarCon(b)) {
                            while (numCriasPareja(listaCompleta, a, b) < Animal.MAX_CRIAS) {
                                listaCompleta.add(a.criar(b));
                            }
                        }
                    }
                }
            }
        }
        return listaCompleta;
    }

    private static int numCriasPareja(List<Animal> lista, Animal p, Animal m) {
        int numCrias = 0;
        for (Animal a : lista) {
            if((a.getPadre() == p && a.getMadre() == m)) // || (a.getPadre() == m && a.getMadre() == p))
                numCrias++;
        }
        return numCrias;
    }
}
