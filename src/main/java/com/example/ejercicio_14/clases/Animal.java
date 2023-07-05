package com.example.ejercicio_14.clases;

public abstract class Animal implements ISexual {

    private Reinos reino;
    private Tipos tipo;
    private String raza;
    private Medios medio;
    private Sexo sexo;

    public Animal() {
    }

    public Animal(Reinos reino, Tipos tipo, String raza, Medios medio) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medio = medio;
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
        return this.sexo;
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
                ", clase=" + this.getClass().getName() +
                '}';
    }

    public enum Reinos {
        mamifero, ave, pez
    }

    public enum Tipos {
        gato, periquito, tucan, pezPayaso, vaca, oveja, perro
    }

    public enum Medios {
        acuatico, terrestre, aereo
    }

    public enum Desplazamientos {
        volar, nadar, reptar, caminar
    }
}
