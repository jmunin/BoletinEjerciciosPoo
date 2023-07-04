package com.example.ejercicio_11;

import com.example.ejercicio_10.Animal;

public class Mascota extends com.example.ejercicio_10.Animal implements IAnimalDomestico{
    private String nombre;
    private String propietario;

    public Mascota(Reinos reino, Tipos tipo, String raza, Medios medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Mascota(Animal animal, String nombre, String propietario) {
        super(animal);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString()  + "Propietario=" + this.getPropietario()
                                 + " Nombre=" + this.getNombre();
    }
}
