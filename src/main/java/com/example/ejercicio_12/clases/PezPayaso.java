package com.example.ejercicio_12.clases;

import com.example.ejercicio_10.clases.Animal;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(Reinos reino, Tipos tipo, String raza, Medios medio) {
        super(reino, tipo, raza, medio);
    }

    public PezPayaso(Animal animal) {
        super(animal);
    }
}
