package ar.edu.unju.escmi.tp2.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a%4==0 && a%100!=0)
            System.out.println("El año "+a+ " SI es bisiesto");
        else if(a%400==0)
            System.out.println("El año "+a+ " SI es bisiesto");
        else 
            System.out.println("El año "+a+ " NO es bisiesto");
    }
}