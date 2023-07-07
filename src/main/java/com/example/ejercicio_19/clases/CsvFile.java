package com.example.ejercicio_19.clases;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvFile {

    public static final String CSV_FILE_NAME = "src/main/resources/data.csv";

    public void WriteCsvFile(List<String> dataLines) throws IOException {
        File csvOutputFile = new File(CSV_FILE_NAME);
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            dataLines.stream()
                    //.map(this::convertToCSV)
                    .forEach(pw::println);
        }
        System.out.printf("El archivo '%s' %s existe.\n", CSV_FILE_NAME, csvOutputFile.exists() ? "si" : "no");
    }

    private String convertToCSV(String data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    private String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }
}
