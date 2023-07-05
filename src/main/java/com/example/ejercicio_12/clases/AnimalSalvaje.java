package com.example.ejercicio_12.clases;

import com.example.ejercicio_10.clases.Animal;

public class AnimalSalvaje extends Animal {

    public AnimalSalvaje(Reinos reino, Tipos tipo, String raza, Medios medio) {
        super(reino, tipo, raza, medio);
    }

    public AnimalSalvaje(Animal animal) {
        super(animal);
    }
}
