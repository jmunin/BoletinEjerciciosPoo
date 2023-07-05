package com.example.ejercicio_12.clases;

import com.example.ejercicio_10.clases.Animal;
import com.example.ejercicio_11.clases.Mascota;

public class Perro extends Mascota {
    public Perro(Reinos reino, Tipos tipo, String raza, Medios medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio, nombre, propietario);
    }

    public Perro(Animal animal, String nombre, String propietario) {
        super(animal, nombre, propietario);
    }
}
