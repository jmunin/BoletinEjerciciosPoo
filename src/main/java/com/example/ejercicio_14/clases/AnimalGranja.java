package com.example.ejercicio_14.clases;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class AnimalGranja extends Animal implements IAnimalDomestico {

    private String propietario;

    public AnimalGranja(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, String propietario) {
        super(reino, tipo, medio, raza, sexo);
        this.propietario = propietario;
    }

    public AnimalGranja(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, String propietario, AnimalGranja padre, AnimalGranja madre) {
        super(reino, tipo, medio, raza, sexo, padre, madre);
        this.propietario = propietario;
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return super.toString() + " Propietario=" + this.getPropietario();
    }

    @Override
    public Animal criar(Animal a) {
        Sexo sexo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;
        AnimalGranja madre = (AnimalGranja) a;
        String propietario = madre.getPropietario();
        return getAnimalGranja(this.getRaza(), sexo, propietario, this, madre);
    }

    private Animal getAnimalGranja(String raza, Sexo sexo, String propietario, AnimalGranja padre, AnimalGranja madre) {
        Constructor<? extends AnimalGranja> constructor = null;
        try {
            constructor = this.getClass().getConstructor(
                    String.class,
                    Sexo.class,
                    String.class,
                    AnimalGranja.class,
                    AnimalGranja.class
            );
            Animal cria = constructor.newInstance(
                    raza,
                    sexo,
                    propietario,
                    padre,
                    madre
            );
            return cria;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
