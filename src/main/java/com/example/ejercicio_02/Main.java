package com.example.ejercicio_02;

import com.example.utils.Input;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String numero = Input.string("Introduce un número entero: ");
        int parse_numero;
        try {
            parse_numero = Integer.parseInt(numero);
            for (int i = 1; i < 11; i++) {
                if (parse_numero % i == 0)
                    System.out.printf("El número %d es múltiplo de %d.\n", parse_numero, i);
            }
        } catch (Exception e) {
            System.out.printf("'%s' no es un número entero válido.", numero);
        }
    }
}