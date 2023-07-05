package com.example.ejercicio_14.clases;

public abstract class Animal implements ISexual {

    private Reino reino;
    private Tipo tipo;
    private String raza;
    private Medio medio;
    private ISexual.Sexo sexo;

    public Animal() {
    }

    public Animal(Reino reino, Tipo tipo, Medio medio, String raza, ISexual.Sexo sexo) {
        this.reino = reino;
        this.tipo = tipo;
        this.medio = medio;
        this.raza = raza;
        this.sexo = sexo;
    }

    public Animal(Animal animal) {
        this.reino = animal.getReino();
        this.tipo = animal.getTipo();
        this.medio = animal.getMedio();
        this.raza = animal.getRaza();
        this.setSexo(animal.getSexo());
    }

    public abstract void reproducirSonido();

    public abstract void desplazarse();

    public Reino getReino() {
        return reino;
    }

    //public void setReino(Reinos reino) { this.reino = reino; }

    public Tipo getTipo() {
        return tipo;
    }

    //public void setTipo(Tipos tipo) { this.tipo = tipo; }

    public String getRaza() {
        return raza;
    }

    //public void setRaza(String raza) { this.raza = raza; }

    public Medio getMedio() {
        return medio;
    }

    //public void setMedio(Medios medio) { this.medio = medio; }

    @Override
    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino=" + reino +
                ", tipo=" + tipo +
                ", raza='" + raza + '\'' +
                ", medio=" + medio +
                ", clase=" + this.getClass().getSimpleName() +
                ", sexo=" + sexo +
                '}';
    }


}
