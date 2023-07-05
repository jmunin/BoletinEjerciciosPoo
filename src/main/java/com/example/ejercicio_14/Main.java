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
        Animal animal;
        animal = new Gato(Animal.Reinos.mamifero, Animal.Tipos.gato, "siamés", Animal.Medios.terrestre, "misifú", "pepe");
        addParejas(lista, animal);
        animal = new Perro(Animal.Reinos.mamifero, Animal.Tipos.perro, "pastor", Animal.Medios.terrestre, "troski", "pepe");
        addParejas(lista, animal);
        animal = new Tucan(Animal.Reinos.ave, Animal.Tipos.tucan, "andino", Animal.Medios.aereo);
        addParejas(lista, animal);
        animal = new Oveja(Animal.Reinos.mamifero, Animal.Tipos.oveja, "dorset", Animal.Medios.terrestre, "pepe");
        addParejas(lista, animal);
        animal = new Vaca(Animal.Reinos.mamifero, Animal.Tipos.vaca, "rubia gallega", Animal.Medios.terrestre, "pepe");
        addParejas(lista, animal);
        animal = new PezPayaso(Animal.Reinos.pez, Animal.Tipos.pezPayaso, "común", Animal.Medios.acuatico);
        addParejas(lista, animal);

        System.out.println(lista.toString());
        System.out.println(lista.size());
    }

    private static void addParejas(List<Animal> lista, Animal animal) {
        animal.setSexo(ISexual.Sexo.macho);
        lista.add(animal);
        animal.setSexo(ISexual.Sexo.hembra);
        lista.add(animal);
    }

    private static void test() {
        Gato gato = new Gato(Animal.Reinos.mamifero, Animal.Tipos.gato, "siamés", Animal.Medios.terrestre, "misifú", "pepe");
        System.out.println(gato.toString());
        gato.reproducirSonido();
        gato.desplazarse();
        Perro perro = new Perro(Animal.Reinos.mamifero, Animal.Tipos.perro, "pastor", Animal.Medios.terrestre, "troski", "pepe");
        System.out.println(perro.toString());
        perro.reproducirSonido();
        perro.desplazarse();
        Tucan tucan = new Tucan(Animal.Reinos.ave, Animal.Tipos.tucan, "andino", Animal.Medios.aereo);
        System.out.println(tucan.toString());
        tucan.reproducirSonido();
        tucan.desplazarse();
    }

}