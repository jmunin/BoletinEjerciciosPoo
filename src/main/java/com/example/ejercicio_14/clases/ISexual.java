package com.example.ejercicio_14.clases;

public interface ISexual {
    public Sexo getSexo();

    public void setSexo(Sexo sexo);

    public enum Sexo {
        MACHO, HEMBRA
    }
}
