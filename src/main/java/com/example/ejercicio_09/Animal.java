package com.example.ejercicio_09;

public class Animal {
    enum Reinos {
        mamifero, ave
    }
   enum Tipos {
       gato, periquito
   }
    enum Medios {
        acuatico, terrestre, aereo
    }
    private Reinos reino;
    private Tipos tipo;
    private String raza;
    private Medios medios;

    public Animal(Reinos reino, Tipos tipo, String raza, Medios medios) {
        this.reino = reino;
        this.tipo = tipo;
        this.raza = raza;
        this.medios = medios;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "reino=" + reino +
                ", tipo=" + tipo +
                ", raza='" + raza + '\'' +
                ", medios=" + medios +
                '}';
    }
}
