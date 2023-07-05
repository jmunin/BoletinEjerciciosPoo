package com.example.ejercicio_12.clases;

import com.example.ejercicio_10.clases.Animal;
import com.example.ejercicio_11.clases.AnimalGranja;

public class Vaca extends AnimalGranja {
    public Vaca(Reinos reino, Tipos tipo, String raza, Medios medio, String propietario) {
        super(reino, tipo, raza, medio, propietario);
    }

    public Vaca(Animal animal, String propietario) {
        super(animal, propietario);
    }
}
