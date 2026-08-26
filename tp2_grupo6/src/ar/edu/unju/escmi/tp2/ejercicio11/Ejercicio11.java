package ar.edu.unju.escmi.tp2.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero;

        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número entero (" + i + " de 5): ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es PAR.");
            } else {
                System.out.println("El número " + numero + " es IMPAR.");
            }
            System.out.println("----------------------------------");
        }

        sc.close();

	}

}
