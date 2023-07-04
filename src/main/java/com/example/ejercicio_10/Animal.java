package com.example.ejercicio_10;

public class Animal extends com.example.ejercicio_09.Animal {

    public Animal(com.example.ejercicio_09.Animal.Reinos reino, com.example.ejercicio_09.Animal.Tipos tipo, String raza, com.example.ejercicio_09.Animal.Medios medio) {
        super(reino, tipo, raza, medio);
    }

    public Animal(Animal animal) {
        this.setReino(animal.getReino());
        this.setTipo(animal.getTipo());
        this.setRaza(animal.getRaza());
        this.setMedio(animal.getMedio());
    }

    @Override
    protected Object clone() { //throws CloneNotSupportedException {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Animal(this.getReino(), this.getTipo(), this.getRaza(), this.getMedio());
        }
        //return super.clone();
    }
}
