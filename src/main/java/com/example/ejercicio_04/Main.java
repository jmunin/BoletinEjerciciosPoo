package com.example.ejercicio_04;

import com.example.utils.Input;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String numero = Input.string("Introduce un número entero: ");
        int parse_numero;
        try {
            parse_numero = Integer.parseInt(numero);
            long factorial = getFactorial(parse_numero);
            System.out.printf("El factorial de %d es %d.\n", parse_numero, factorial);
        } catch (Exception e) {
            System.out.printf("'%s' no es un número entero válido.", numero);
        }
    }

    private static long getFactorial(Integer entero) {
        long factorial = 1;
        for(int i = 1; i <= entero; i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}