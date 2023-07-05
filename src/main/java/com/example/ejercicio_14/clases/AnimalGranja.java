package com.example.ejercicio_14.clases;

public abstract class AnimalGranja extends Animal implements IAnimalDomestico {

    private String propietario;

    public AnimalGranja(Reinos reino, Tipos tipo, String raza, Medios medio, String propietario) {
        super(reino, tipo, raza, medio);
        this.setPropietario(propietario);
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return super.toString() + " Propietario=" + this.getPropietario();
    }
}