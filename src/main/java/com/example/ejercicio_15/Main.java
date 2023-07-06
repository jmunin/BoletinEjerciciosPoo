package com.example.ejercicio_15;

import com.example.ejercicio_13.clases.*;

import java.util.ArrayList;
import java.util.List;

/*
15. Mover los animales de la lista anterior a tres listas distintas, dependiendo si son
        animales de granja, mascotas o animales salvajes
*/
public class Main {
    public static void main(String[] args) {
        List<Animal> listaTotal = new ArrayList<>();
        com.example.ejercicio_14.Main.cargarListaAnimales(listaTotal);
        List<Animal> listaGranja = new ArrayList<>();
        List<Animal> listaMascotas = new ArrayList<>();
        List<Animal> listaSalvajes = new ArrayList<>();
/*
        for (Animal a: listaTotal) {
            String tipoAnimal = a.getClass().getSimpleName().toLowerCase();
            switch (tipoAnimal) {
                case "perro":
                case "gato":
                    listaMascotas.add(a);
                    break;
                case "oveja":
                case "vaca":
                    listaGranja.add(a);
                    break;
                case "pezpayaso":
                case "tucan":
                    listaSalvajes.add(a);
                    break;
            }
        }
        */
        for (Animal a: listaTotal) {
            if(a instanceof Mascota) {
                listaMascotas.add(a);
            }
            else if(a instanceof AnimalGranja) {
                listaGranja.add(a);
            }
            else if (a instanceof AnimalSalvaje) {
                listaSalvajes.add(a);
            }
        }

        test(listaTotal);
        test(listaGranja);
        test(listaMascotas);
        test(listaSalvajes);

    }

    private static void test(List<Animal> lista) {
        System.out.println(lista.toString());
        System.out.println(lista.size());
    }
}
