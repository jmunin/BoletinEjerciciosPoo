package com.example.ejercicio_20;

import com.example.ejercicio_13.clases.*;
import com.example.ejercicio_19.clases.CsvFile;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.ejercicio_13.clases.Animal.findAnimalById;
import static com.example.ejercicio_19.clases.CsvFile.*;

/*
20. Cargar la lista de animales a partir del archivo CSV generado en el apartado anterior
 */
public class Main {
    public static void main(String[] args) {

        List<Animal> lista = loadFromCsv();
    }

    public static List<Animal> loadFromCsv() {
        List<Animal> lista = new ArrayList<>();
        CsvFile csvExample;
        csvExample = new CsvFile();
        List<String[]> listaCsv;
        Animal padre, madre;

        try {
            listaCsv = csvExample.readCsvFile();
            //listaCsv.stream().skip(1);
            for (String[] a: listaCsv.subList(1, listaCsv.size())) {
                // me salto la 1a fila
                padre = findAnimalById(lista, Integer.parseInt(a[COLUMN_MACHO]));
                madre =  findAnimalById(lista, Integer.parseInt(a[COLUMN_HEMBRA]));
                switch (Tipo.valueOf(a[COLUMN_TIPO])) {
                    case GATO:
                        lista.add(new Gato(Integer.parseInt(a[COLUMN_ID]), a[COLUMN_RAZA], Sexo.valueOf(a[COLUMN_SEXO]), a[COLUMN_NOMBRE], a[COLUMN_PROPIETARIO], (Gato)padre, (Gato)madre));
                        break;
                    case PERRO:
                        lista.add(new Perro(Integer.parseInt(a[COLUMN_ID]), a[COLUMN_RAZA], Sexo.valueOf(a[COLUMN_SEXO]), a[COLUMN_NOMBRE], a[COLUMN_PROPIETARIO], (Perro)padre, (Perro)madre));
                        break;
                    case TUCAN:
                        lista.add(new Tucan(Integer.parseInt(a[COLUMN_ID]), a[COLUMN_RAZA], Sexo.valueOf(a[COLUMN_SEXO]), (Tucan)padre, (Tucan)madre));
                        break;
                    case PEZ_PAYASO:
                        lista.add(new PezPayaso(Integer.parseInt(a[COLUMN_ID]), a[COLUMN_RAZA], Sexo.valueOf(a[COLUMN_SEXO]), (PezPayaso)padre, (PezPayaso)madre));
                        break;
                    case VACA:
                        lista.add(new Vaca(Integer.parseInt(a[COLUMN_ID]), a[COLUMN_RAZA], Sexo.valueOf(a[COLUMN_SEXO]), a[COLUMN_PROPIETARIO], (Vaca)padre, (Vaca)madre));
                        break;
                    case OVEJA:
                        lista.add(new Oveja(Integer.parseInt(a[COLUMN_ID]), a[COLUMN_RAZA], Sexo.valueOf(a[COLUMN_SEXO]), a[COLUMN_PROPIETARIO], (Oveja)padre, (Oveja)madre));
                        break;
                    default:
                        throw new IllegalStateException("Valor de TIPO inesperado: " + Tipo.valueOf(a[2]));
                }
                System.out.println(Arrays.toString(a));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }

}

