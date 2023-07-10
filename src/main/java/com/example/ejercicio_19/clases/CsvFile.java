package com.example.ejercicio_19.clases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvFile {

    public static final String CSV_FILE_NAME = "src/main/resources/data.csv";
    public static final String COMMA_DELIMITER = ",";
    public static final int VALUE_IF_NULL = Integer.parseInt("0");
    public static final int NUM_MAX_COLUMNS_CSV = 10;
    public static final String COLUMNAS_CSV = "ID,REINO,TIPO,MEDIO,RAZA,SEXO,MACHO,HEMBRA,PROPIETARIO,NOMBRE";
    public static final int COLUMN_ID = 0;
    public static final int COLUMN_REINO = 1;
    public static final int COLUMN_TIPO = 2;
    public static final int COLUMN_MEDIO = 3;
    public static final int COLUMN_RAZA = 4;
    public static final int COLUMN_SEXO = 5;
    public static final int COLUMN_MACHO = 6;
    public static final int COLUMN_HEMBRA = 7;
    public static final int COLUMN_PROPIETARIO = 8;
    public static final int COLUMN_NOMBRE = 9;

    public void writeCsvFile(List<String> dataLines) throws IOException {
        File csvOutputFile = new File(CSV_FILE_NAME);
        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
            pw.println(COLUMNAS_CSV);
            dataLines.stream()
//                    .map(this::convertToCSV)
//                    .forEach(pw::println);
                    .forEach(value-> pw.println(value));
        }
        System.out.printf("El archivo '%s' %s existe.\n", CSV_FILE_NAME, csvOutputFile.exists() ? "si" : "no");
    }

    public List<String[]> readCsvFile() throws FileNotFoundException {
        List<String[]> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(CSV_FILE_NAME))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()).toArray(String[]::new));
            }
        }
        return records;
    }

    private List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(COMMA_DELIMITER);
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }

    private String convertToCSV(String data) {
        return Stream.of(data)
                .map(this::escapeSpecialCharacters)
                .collect(Collectors.joining(COMMA_DELIMITER));
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
