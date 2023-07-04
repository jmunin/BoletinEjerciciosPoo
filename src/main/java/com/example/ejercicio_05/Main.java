package com.example.ejercicio_05;

import com.example.utils.Input;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double parse_numero = 0;
        String numero = "";
        try {
            numero = Input.string("Introduce un número: ").replace(',','.');
            parse_numero = Double.parseDouble(numero);
            int parteEntera = getParteEntera(parse_numero);
            double parteDecimal = getParteDecimal(parse_numero);
            System.out.printf("La parte entera de '%s' es %d y la parte decimal %f.\n", numero, parteEntera, parteDecimal);
        } catch (Exception e){
            System.out.printf("'%s' no es un número válido.", numero);
        }
    }

    private static int getParteEntera(double numero) {
        return (int) numero;
    }

    private static double getParteDecimal(double numero) {
        return numero - (int) numero;
    }
}