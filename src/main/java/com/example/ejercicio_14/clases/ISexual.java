package com.example.ejercicio_14.clases;

public interface ISexual {
    Sexo getSexo();

    void setSexo(Sexo sexo);

    enum Sexo {
        MACHO, HEMBRA
    }
}
