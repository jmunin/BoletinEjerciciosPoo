package com.example.ejercicio_05_1;

import com.example.utils.Input;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String numero = Input.string("Introduce un número: ").replace(',','.');
        double parse_numero;
        try {
            parse_numero = Double.parseDouble(numero);
            String parteEntera = getParteEntera(numero);
            String parteDecimal = getParteDecimal(numero);
            System.out.printf("La parte entera de '%s' es %s y la parte decimal %s.\n", numero, parteEntera, parteDecimal);
        } catch (Exception e) {
            System.out.printf("'%s' no es un número válido.", numero);
        }
    }


    private static String getParteEntera(String numero) {
        int index = numero.indexOf('.') == -1 ? numero.length() : numero.indexOf('.');
        return numero.substring(0,index)  ;
    }

    private static String getParteDecimal(String numero) {
        int index = numero.indexOf('.') == -1 ? numero.length() : numero.indexOf('.') + 1;
        return numero.substring(index);
    }
}