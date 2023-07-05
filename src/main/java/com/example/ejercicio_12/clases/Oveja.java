package com.example.ejercicio_12.clases;

import com.example.ejercicio_10.clases.Animal;
import com.example.ejercicio_11.clases.AnimalGranja;

public class Oveja extends AnimalGranja {
    public Oveja(Reinos reino, Tipos tipo, String raza, Medios medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Oveja(Animal animal, String propietario) {
        super(animal, propietario);
    }
}
