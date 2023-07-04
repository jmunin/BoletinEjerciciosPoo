package com.example.ejercicio_07;

import com.example.utils.Input;

/*
7. Crear el metodo imprimirValor que para cada tipo de datos imprime:
        a. “El {tipo de dato en castellano} es {valor} ”
        b. Por ejemplo:
        i. El entero es 5
        ii. El flotante es 2.7
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(imprimirValor((byte) 127));
        System.out.println(imprimirValor((short)32767));
        System.out.println(imprimirValor(2147483647));
        System.out.println(imprimirValor(9223372036854775807L));
        System.out.println(imprimirValor(3.402823e38f));
        System.out.println(imprimirValor(1.79769313486232e307));
        System.out.println(imprimirValor('a'));
        System.out.println(imprimirValor(false));

    }

    private static String imprimirValor(byte dato) {
        return String.format("El entero de bytes es %s", String.valueOf(dato));
    }
    private static String imprimirValor(short dato) {
        return String.format("El entero corto es %s", String.valueOf(dato));
    }
    private static String imprimirValor(int dato) {
        return String.format("El entero es %s", String.valueOf(dato));
    }
    private static String imprimirValor(long dato) {
        return String.format("El entero largo es %s", String.valueOf(dato));
    }
    private static String imprimirValor(float dato) {
        return String.format("El número real de simple precisión es %s", String.valueOf(dato));
    }
    private static String imprimirValor(double dato) {
        return String.format("El número real de doble precisión es %s", String.valueOf(dato));
    }
    private static String imprimirValor(char dato) {
        return String.format("El caracter es %s", String.valueOf(dato));
    }
    private static String imprimirValor(boolean dato) {
        return String.format("El número booleano es %s", String.valueOf(dato));
    }
}