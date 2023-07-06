package com.example.ejercicio_13.clases;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Mascota extends Animal implements IAnimalDomestico {
    private String nombre;
    private String propietario;

    public Mascota(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, String nombre, String propietario) {
        super(reino, tipo, medio, raza, sexo);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Mascota(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, String nombre, String propietario, Mascota padre, Mascota madre) {
        super(reino, tipo, medio, raza, sexo, padre, madre);
        this.nombre = nombre;
        this.propietario = propietario;
    }

    public Mascota(Mascota mascota) {
        super(mascota);
        this.nombre = mascota.getNombre();
        this.propietario = mascota.getPropietario();
    }

    @Override
    public String getPropietario() {
        return propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + " Propietario=" + this.getPropietario()
                + " Nombre=" + this.getNombre();
    }

    @Override
    public Animal criar(Animal a) {
        Sexo sexo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;
        Mascota madre = (Mascota) a;
        String nombre = String.format("%s-%s", this.getNombre(), madre.getNombre());
        String propietario = madre.getPropietario();
        return getMascota(this.getRaza(), sexo, this, madre, nombre, propietario);
    }

    private Animal getMascota(String raza, Sexo sexo, Mascota padre, Mascota madre, String nombre, String propietario) {
        Constructor<? extends Mascota> constructor = null;
        try {
            constructor = this.getClass().getConstructor(
                    String.class,
                    Sexo.class,
                    String.class,
                    String.class,
                    Mascota.class,//this.getClass(),
                    Mascota.class//this.getClass()
            );
            Animal cria = constructor.newInstance(
                    raza,
                    sexo,
                    nombre,
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
