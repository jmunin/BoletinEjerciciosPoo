package com.example.ejercicio_14.clases;

public abstract class Animal implements ISexual {

    private Reinos reino;
    private Tipos tipo;
    private String raza;
    private Medios medio;
    private ISexual.Sexo sexo;

    public Animal() {
    }

    public Animal(Reinos reino, Tipos tipo, String raza, Medios medio, ISexual.Sexo sexo) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
        this.sexo = sexo;
    }

    public Animal(Animal animal) {
        this.setReino(animal.getReino());
        this.setTipo(animal.getTipo());
        this.setRaza(animal.getRaza());
        this.setMedio(animal.getMedio());
        this.setSexo(animal.getSexo());
    }

    public abstract void reproducirSonido();

    public abstract void desplazarse();

    public Reinos getReino() {
        return reino;
    }

    public void setReino(Reinos reino) {
        this.reino = reino;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Medios getMedio() {
        return medio;
    }

    public void setMedio(Medios medio) {
        this.medio = medio;
    }

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

    public enum Reinos {
        MAMIFERO, AVE, PEZ
    }

    public enum Tipos {
        GATO, PERIQUITO, TUCAN, PEZ_PAYASO, VACA, OVEJA, PERRO
    }

    public enum Medios {
        ACUATICO, TERRESTRE, AEREO
    }

    public enum Desplazamientos {
        VOLAR, NADAR, REPTAR, CAMINAR
    }
}
