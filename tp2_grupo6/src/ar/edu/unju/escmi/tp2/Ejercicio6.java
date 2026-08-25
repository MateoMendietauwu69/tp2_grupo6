package ar.edu.unju.escmi.tp2.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Ingrese el valor del radio del círculo (entre -128 y 127): ");
        byte radio = sc.nextByte();


        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        
        sc.close();

	}

}
