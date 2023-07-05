package com.example.ejercicio_10.clases;

public class Animal extends com.example.ejercicio_09.clases.Animal {

    public Animal(com.example.ejercicio_09.clases.Animal.Reinos reino, com.example.ejercicio_09.clases.Animal.Tipos tipo, String raza, com.example.ejercicio_09.clases.Animal.Medios medio) {
        super(reino, tipo, raza, medio);
    }

    public Animal(Animal animal) {
        this.setReino(animal.getReino());
        this.setTipo(animal.getTipo());
        this.setRaza(animal.getRaza());
        this.setMedio(animal.getMedio());
    }

    @Override
    public Object clone() { //throws CloneNotSupportedException {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Animal(this.getReino(), this.getTipo(), this.getRaza(), this.getMedio());
        }
        //return super.clone();
    }
}
