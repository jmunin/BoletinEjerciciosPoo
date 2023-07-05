package com.example.ejercicio_14.clases;

public abstract class AnimalGranja extends Animal implements IAnimalDomestico {

    private String propietario;

    public AnimalGranja(Reino reino, Tipo tipo, Medio medio, String raza, ISexual.Sexo sexo, String propietario) {
        super(reino, tipo, medio, raza, sexo);
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

    @Override
    public String toString() {
        return super.toString() + " Propietario=" + this.getPropietario();
    }
}
