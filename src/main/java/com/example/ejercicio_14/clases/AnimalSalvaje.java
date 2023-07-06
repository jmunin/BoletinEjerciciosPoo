package com.example.ejercicio_14.clases;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class AnimalSalvaje extends Animal {

    public AnimalSalvaje(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo) {
        super(reino, tipo, medio, raza, sexo);
    }

    public AnimalSalvaje(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, AnimalSalvaje padre, AnimalSalvaje madre) {
        super(reino, tipo, medio, raza, sexo, padre, madre);
    }

    @Override
    public Animal criar(Animal a) {
        Sexo sexo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;
        AnimalSalvaje madre = (AnimalSalvaje) a;
        return getAnimalSalvaje(this.getRaza(), sexo, this, madre);
    }

    private Animal getAnimalSalvaje(String raza, Sexo sexo, AnimalSalvaje padre, AnimalSalvaje madre) {
        Constructor<? extends AnimalSalvaje> constructor = null;
        try {
            constructor = this.getClass().getConstructor(
                    String.class,
                    Sexo.class,
                    AnimalSalvaje.class,
                    AnimalSalvaje.class
            );
            Animal cria = constructor.newInstance(
                    raza,
                    sexo,
                    padre,
                    madre
            );
            return cria;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException |
                 InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
