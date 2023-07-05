package com.example.ejercicio_14.clases;

public abstract class Mascota extends Animal implements IAnimalDomestico {
    private String nombre;
    private String propietario;

    public Mascota(Reinos reino, Tipos tipo, String raza, Medios medio, String nombre, String propietario) {
        super(reino, tipo, raza, medio);
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
        return super.toString() + " Propietario=" + this.getPropietario()
                + " Nombre=" + this.getNombre();
    }
}
