package ar.edu.unju.escmi.tp2.ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int [8];
        for(int i=0; i<8; i++)
            n[i] = sc.nextInt();
        for(int j=0; j<8; j++)
            System.out.println("Indice: "+ j + " Valor: "+ n[j]);
    }
}
