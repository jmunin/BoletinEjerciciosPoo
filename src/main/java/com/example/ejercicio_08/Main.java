package com.example.ejercicio_08;

/*
8. Crear un programa con un menú de línea de comandos.
        a. Si se selección la opción “a”, se solicitará un numero para añadir a la lista.
        b. Si se selección la opción “s”, se devolverá la suma de los elementos de la lista.
        c. Si se selecciona la opción “d” se eliminará el último elemento de la lista.
*/

import com.example.utils.Input;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        char comando;
        do {
            mostrarMenu();
            try {
                comando = Character.toLowerCase(Input.character());
            } catch (Exception e) {
                comando = '\u0000';
            }
            switch (comando) {
                case 'a':
                    System.out.println("Has seleccionado la opcion 1");
                    try {
                        Integer numero = Input.integer("Introduce un número para añadir a la lista: ");
                        lista.add(numero);
                    } catch (Exception e) {
                        System.out.println("Número incorrecto.");
                    }
                    break;
                case 's':
                    System.out.println("Has seleccionado la opcion 2");
                    int suma = getSum(lista);
                    System.out.printf("La suma de los elementos de la lista es '%d'\n", suma);
                    break;
                case 'd':
                    System.out.println("Has seleccionado la opcion 3");
                    if (lista.size() > 0)
                        lista.remove(lista.size() - 1);
                    else
                        System.out.println("La lista ya está vacía.");
                    break;
                case 'x':
                    System.out.println("Has seleccionado la opcion 4");
                    //salir=true;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        } while (comando != 'x');
    }

    private static void mostrarMenu() {
        System.out.println("Menú: ");
        System.out.println("(a) Añadir número a la lista. ");
        System.out.println("(s) Mostrar suma elementos lista. ");
        System.out.println("(d) Eliminar último elemento lista. ");
        System.out.println("(x) Salir. ");
        System.out.println("Escoger opción: ");
    }

    public static int getSum(List<Integer> nums) {
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }
        return sum;
    }
}