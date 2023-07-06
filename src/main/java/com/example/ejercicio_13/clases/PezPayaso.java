package com.example.ejercicio_13.clases;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(String raza, Sexo sexo) {
        super(Reino.PEZ, Tipo.PEZ_PAYASO, Medio.ACUATICO, raza, sexo);
    }

    public PezPayaso(String raza, Sexo sexo, AnimalSalvaje padre, AnimalSalvaje madre) {
        super(Reino.PEZ, Tipo.PEZ_PAYASO, Medio.ACUATICO, raza, sexo, padre, madre);
    }

    @Override
    public void reproducirSonido() {
        System.out.println("glu glu");
    }

    @Override
    public void desplazarse() {
        System.out.println("Nado");
    }

}
