package com.example.ejercicio_13.clases;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.ejercicio_19.clases.CsvFile.*;

public abstract class AnimalSalvaje extends Animal {

    public AnimalSalvaje(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo) {
        super(reino, tipo, medio, raza, sexo);
    }

    public AnimalSalvaje(Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, AnimalSalvaje padre, AnimalSalvaje madre) {
        super(reino, tipo, medio, raza, sexo, padre, madre);
    }

    public AnimalSalvaje(int id, Reino reino, Tipo tipo, Medio medio, String raza, Sexo sexo, AnimalSalvaje padre, AnimalSalvaje madre) {
        super(id, reino, tipo, medio, raza, sexo, padre, madre);
    }

    @Override
    public Animal criar(Animal a) {
        Sexo sexo = (Math.random() > 0.5) ? Sexo.MACHO : Sexo.HEMBRA;
        AnimalSalvaje madre = (AnimalSalvaje) a;
        return getAnimalSalvaje(this.getRaza(), sexo, this, madre);
    }
    @Override
    public String toStringCsv() {
        List<String> a = Stream.of(id,
                        reino,
                        tipo,
                        medio,
                        raza,
                        sexo,
                        (padre != null) ? padre.id : VALUE_IF_NULL,
                        (madre != null) ? madre.id : VALUE_IF_NULL)
                .map(value -> String.valueOf(value))
                .map(value -> value.replaceAll("\"", "\"\""))
                .map(value -> Stream.of("\"", ",").anyMatch(value::contains) ? "\"" + value + "\"" : value)
                .collect(Collectors.toList());
        while(a.size() < NUM_MAX_COLUMNS_CSV) {
            a.add("");
        }
        return String.join(COMMA_DELIMITER, a);
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
