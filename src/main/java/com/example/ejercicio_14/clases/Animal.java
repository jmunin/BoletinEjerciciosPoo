package com.example.ejercicio_14.clases;

public abstract class Animal implements ISexual {

    public static final int MAX_CRIAS = 3;
    private final Animal padre;
    private final Animal madre;
    private final Reino reino;
    private final Tipo tipo;
    private final String raza;
    private final Medio medio;
    private Sexo sexo;

    public Animal(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo) {
        this.reino = reino;
        this.tipo = tipo;
        this.medio = medio;
        this.raza = raza;
        this.sexo = sexo;
        this.padre = null;
        this.madre = null;
    }

    public Animal(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, Animal padre, Animal madre) {
        this.reino = reino;
        this.tipo = tipo;
        this.medio = medio;
        this.raza = raza;
        this.sexo = sexo;
        this.padre = padre;
        this.madre = madre;
    }

    public Animal(Animal animal) {
        this.reino = animal.getReino();
        this.tipo = animal.getTipo();
        this.medio = animal.getMedio();
        this.raza = animal.getRaza();
        this.setSexo(animal.getSexo());
        this.padre = animal.getPadre();
        this.madre = animal.getMadre();
    }

    public abstract void reproducirSonido();

    public abstract void desplazarse();

    public abstract Animal criar(Animal a);

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

    public Animal getPadre() {
        return padre;
    }

    public Animal getMadre() {
        return madre;
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

    public boolean puedeCriarCon(Animal animal) {
        if (animal != this) {
            //animales distintos
            if (this.getSexo() != animal.getSexo()) {
                //sexos distintos
                if (this.getTipo() == animal.getTipo()) {
                    //mismo tipo de animal
                    //no son familia
                    return !this.esFamiliaDe(animal);
                }
            }
        }
        return false;
    }
    // Ningún animal puede criar con sus padres o hermanos.
    private boolean esFamiliaDe(Animal m) {
        Animal p = this;
        boolean padre = false, madre = false, hermanos = false, iniciales = false;

        if (p.getPadre() == m.getPadre() && (p.getMadre() == m.getMadre())) {
            if (p.getPadre() == null && p.getMadre() == null) {
                iniciales = true; //son los iniciales
            } else {
                hermanos = true; //son hermanos
            }
        }
        if (p == m.getPadre()) {
            padre = true; //es el padre de la madre
        }
        if (m == p.getMadre()) {
            madre = true; //es la madre del padre
        }
        if (iniciales) {
            return false;
        }
        if (hermanos) {
            return true;
        }
        return padre || madre;
    }

}
