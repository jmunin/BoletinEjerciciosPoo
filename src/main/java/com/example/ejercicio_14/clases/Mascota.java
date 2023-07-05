package com.example.ejercicio_14.clases;

public abstract class Mascota extends Animal implements IAnimalDomestico {
    private String nombre;
    private String propietario;

    public Mascota(Reino reino, Tipo tipo, Medio medio, String raza, ISexual.Sexo sexo, String nombre, String propietario) {
        super(reino, tipo, medio, raza, sexo);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Mascota(Mascota mascota) {
        super(mascota);
        this.nombre = mascota.getNombre();
        this.propietario = mascota.getPropietario();
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
