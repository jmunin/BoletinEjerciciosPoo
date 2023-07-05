package com.example.ejercicio_14.clases;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(String raza, ISexual.Sexo sexo) {
        super(Reino.PEZ, Tipo.PEZ_PAYASO, Medio.ACUATICO, raza, sexo);
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
