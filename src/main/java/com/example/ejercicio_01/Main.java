package com.example.ejercicio_01;

import com.example.utils.Input;
/*
1. Pedir un numero entero al usuario, imprimir si el número es par o impar.
 */
public class Main {
    public static void main(String[] args) {
        String numero = Input.string("Introduce un número entero: ");
        int parse_numero;
        try {
            parse_numero = Integer.parseInt(numero);
            if (parse_numero % 2 == 0)
                System.out.printf("El número %d es par.", parse_numero);
            else
                System.out.printf("El número %d es impar.", parse_numero);
        } catch (Exception e) {
            System.out.printf("'%s' no es un número entero válido.", numero);
        }
    }
}