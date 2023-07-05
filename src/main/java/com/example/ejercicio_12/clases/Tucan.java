package com.example.ejercicio_12.clases;

import com.example.ejercicio_10.clases.Animal;

public class Tucan extends AnimalSalvaje {
    public Tucan(Reinos reino, Tipos tipo, String raza, Medios medio) {
        super(reino, tipo, raza, medio);
    }

    public Tucan(Animal animal) {
        super(animal);
    }
}
