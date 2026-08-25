package ar.edu.unju.escmi.tp2.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int tamanio;

        do {
            System.out.print("Ingrese el tamaño del array (un número entero entre 5 y 10): ");
            tamanio = sc.nextInt();
            
            if (tamanio < 5 || tamanio > 10) {
                System.out.println("Error: El número debe estar en el rango [5, 10]. Intente nuevamente.");
            }
        } while (tamanio < 5 || tamanio > 10);

        sc.nextLine();

        String[] nombres = new String[tamanio];

        System.out.println("\n--- INGRESO DE NOMBRES ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre para la posición [" + i + "]: ");
            nombres[i] = sc.nextLine();
        }

        
        System.out.println("\n--- MOSTRANDO DESDE EL ÍNDICE 0 ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición [" + i + "]: " + nombres[i]);
        }

        System.out.println("\n--- MOSTRANDO DESDE LA ÚLTIMA POSICIÓN ---");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición [" + i + "]: " + nombres[i]);
        }

        sc.close();

	}

}
