package com.example.ejercicio_05_1;

import com.example.utils.Input;

// 5. Dado un numero decimal, devolver por separado la parte entera y la parte decimal.
public class Main {
    public static void main(String[] args) {
        String numero = Input.string("Introduce un número: ").replace(',', '.');
        double parse_numero;
        try {
            parse_numero = Double.parseDouble(numero);
            String parteEntera = getParteEntera(numero);
            String parteDecimal = getParteDecimal(numero);
            System.out.printf("La parte entera de '%s' es '%s' y la parte decimal '0.%s'.\n", numero, parteEntera, parteDecimal);
        } catch (Exception e) {
            System.out.printf("'%s' no es un número válido.", numero);
        }
    }

    private static String getParteEntera(String numero) {
        int index = numero.indexOf('.') == -1 ? numero.length() : numero.indexOf('.');
        return numero.substring(0, index);
    }

    private static String getParteDecimal(String numero) {
        int index = numero.indexOf('.') == -1 ? numero.length() : numero.indexOf('.') + 1;
        return (numero.substring(index).length() == 0 ? "0" : numero.substring(index));
    }
}