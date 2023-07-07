package com.example.ejercicio_19;

import com.example.ejercicio_19.clases.CsvFile;
import com.example.ejercicio_13.clases.Animal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
19. Persistir la lista final de animales en un archivo CSV.
 */
public class Main {

    public static void main(String[] args) {
        CsvFile csvExample;
        csvExample = new CsvFile();
        List<Animal> lista;
        lista = com.example.ejercicio_16.Main.reproducciones();
//        String recordAsCsv = lista.stream()
//                .map(Animal::toCsvRow)
//                .collect(Collectors.joining(System.getProperty("line.separator")));
//        String[] listaAsCsv = lista.stream()
//                .map(Animal::toCsvRow)
//                .toArray(String[]::new);
        List<String> listaAsCsv = lista.stream()
                .map(Animal::toCsvRow)
                .collect(Collectors.toList());
        try {
            csvExample.WriteCsvFile(listaAsCsv);
        } catch (IOException e) {
            System.out.println("Imposible crear archivo csv correctamente.");
            throw new RuntimeException(e);
        }


    }


}

