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

        System.out.println(lista.toString());
        System.out.println(lista.size());
    }

    public static void cargarListaAnimales(List<Animal> lista) {
        Animal animalMacho;
        Animal animalHembra;

        animalMacho = new Gato(Animal.Reinos.MAMIFERO, Animal.Tipos.GATO, "siamés", Animal.Medios.TERRESTRE, ISexual.Sexo.MACHO, "misifu", "pepe");
        lista.add(animalMacho);
        animalHembra = new Gato(Animal.Reinos.MAMIFERO, Animal.Tipos.GATO, "siamés", Animal.Medios.TERRESTRE, ISexual.Sexo.HEMBRA, "lola", "pepe");
        lista.add(animalHembra);

        animalMacho = new Perro(Animal.Reinos.MAMIFERO, Animal.Tipos.PERRO, "pastor", Animal.Medios.TERRESTRE, ISexual.Sexo.MACHO, "troski", "pepe");
        lista.add(animalMacho);
        animalHembra = new Perro(Animal.Reinos.MAMIFERO, Animal.Tipos.PERRO, "pastor", Animal.Medios.TERRESTRE, ISexual.Sexo.HEMBRA, "chula", "pepe");
        lista.add(animalHembra);

        animalMacho = new Tucan(Animal.Reinos.AVE, Animal.Tipos.TUCAN, "andino", Animal.Medios.AEREO, ISexual.Sexo.MACHO);
        lista.add(animalMacho);
        animalHembra = new Tucan(Animal.Reinos.AVE, Animal.Tipos.TUCAN, "andino", Animal.Medios.AEREO, ISexual.Sexo.HEMBRA);
        lista.add(animalHembra);

        animalMacho = new Oveja(Animal.Reinos.MAMIFERO, Animal.Tipos.OVEJA, "dorset", Animal.Medios.TERRESTRE, ISexual.Sexo.MACHO,"pepe");
        lista.add(animalMacho);
        animalHembra = new Oveja(Animal.Reinos.MAMIFERO, Animal.Tipos.OVEJA, "dorset", Animal.Medios.TERRESTRE, ISexual.Sexo.HEMBRA,"pepe");
        lista.add(animalHembra);

        animalMacho = new Vaca(Animal.Reinos.MAMIFERO, Animal.Tipos.VACA, "rubia gallega", Animal.Medios.TERRESTRE, ISexual.Sexo.MACHO, "pepe");
        lista.add(animalMacho);
        animalHembra = new Vaca(Animal.Reinos.MAMIFERO, Animal.Tipos.VACA, "rubia gallega", Animal.Medios.TERRESTRE, ISexual.Sexo.HEMBRA, "pepe");
        lista.add(animalHembra);

        animalMacho = new PezPayaso(Animal.Reinos.PEZ, Animal.Tipos.PEZ_PAYASO, "común", Animal.Medios.ACUATICO,ISexual.Sexo.MACHO);
        lista.add(animalMacho);
        animalHembra = new PezPayaso(Animal.Reinos.PEZ, Animal.Tipos.PEZ_PAYASO, "común", Animal.Medios.ACUATICO,ISexual.Sexo.HEMBRA);
        lista.add(animalHembra);
    }

    private static void test() {
        Gato gato = new Gato(Animal.Reinos.MAMIFERO, Animal.Tipos.GATO, "siamés", Animal.Medios.TERRESTRE, ISexual.Sexo.MACHO, "misifú", "pepe");
        System.out.println(gato.toString());
        gato.reproducirSonido();
        gato.desplazarse();
        Perro perro = new Perro(Animal.Reinos.MAMIFERO, Animal.Tipos.PERRO, "pastor", Animal.Medios.TERRESTRE, ISexual.Sexo.MACHO, "troski", "pepe");
        System.out.println(perro.toString());
        perro.reproducirSonido();
        perro.desplazarse();
        Tucan tucan = new Tucan(Animal.Reinos.AVE, Animal.Tipos.TUCAN, "andino", Animal.Medios.AEREO, ISexual.Sexo.MACHO);
        System.out.println(tucan.toString());
        tucan.reproducirSonido();
        tucan.desplazarse();
    }

}