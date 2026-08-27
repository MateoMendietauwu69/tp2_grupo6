package ar.edu.unju.escmi.tp2.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanio;
        do {
            System.out.print("Ingrese un numero entero entre 3 y 10: ");
            tamanio = sc.nextInt();
        } while (tamanio < 3 || tamanio > 10);

        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el valor para la posicion [" + i + "]: ");
            array[i] = sc.nextInt();
        }

        int suma = 0;
        System.out.println("\nContenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion [" + i + "] = " + array[i]);
            suma += array[i];
        }

        System.out.println("La suma de todos los valores es: " + suma);

        sc.close();

    }

}
