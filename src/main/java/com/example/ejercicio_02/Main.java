package com.example.ejercicio_02;

import com.example.utils.Input;

import java.util.ArrayList;
import java.util.List;

/*
2. Pedir un numero al usuario. Mostrar si el número es múltiplo de cada uno de los
        numero primos existentes entre 1 y 10;
*/

public class Main {
    public static void main(String[] args) {
        String numero = Input.string("Introduce un número entero: ");
        int parse_numero;
        try {
            parse_numero = Integer.parseInt(numero);
            for (int i = 1; i < 11; i++) {
                if (esPrimo(i)) {
                    if (parse_numero % i == 0)
                        System.out.printf("El número %d es múltiplo de %d.\n", parse_numero, i);
                }
            }
        } catch (Exception e) {
            System.out.printf("'%s' no es un número entero válido.", numero);
        }
    }

    //El número 1 no es un número primo porque por definición, un número primo es un número
    //entero mayor que 1 que solo tiene como divisores positivos a sí mismo y a la unidad.
    // El número 1 no cumple con esta definición ya que solo tiene un divisor.
    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = numero != 1;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}