package com.example.ejercicio_06;

import com.example.utils.Input;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Integer entero = Input.integer("Introduce un número entero: ");
        String fibonacci = getFibonacci(entero);
        System.out.printf("La serie de Fibonacci de %d elementos es %s.\n", entero, fibonacci);
    }

    private static String getFibonacci(Integer count) {
        String fibonacci = "";
        int num1 = 0, num2 = 1;
        for(int i = 1; i<= count; i++){
            fibonacci = fibonacci + num1 + " ";
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        return fibonacci.substring(0, fibonacci.length() - 1);
    }
}