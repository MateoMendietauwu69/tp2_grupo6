package ar.edu.unju.escmi.tp2.ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int i, edad;

        for(i = 0; i < 5; i++){
            edad = sc.nextInt();
            if(1 <= edad && edad <= 12) System.out.println("Es un niño");
            else if(13 <= edad && edad <= 20) System.out.println("Es un joven");
            else if(21 <= edad && edad <= 100) System.out.println("Es un adulto");
            else System.out.println("Edad no permitida");
        }
        
    }
}
