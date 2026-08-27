package ar.edu.unju.escmi.tp2.ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {

        int a = 8, b = 3, c = -5;

        int resultA = a + b + c;
        System.out.println("a) a + b + c = " + resultA);

        int resultB = 2 * b + 3 * (a - c);
        System.out.println("b) 2 * b + 3 * (a - c) = " + resultB);

        double resultC = (double) a / b;
        System.out.println("c) a / b = " + resultC);

        int resultD = a % b;
        System.out.println("d) a % b = " + resultD);

        double resultE = (double) a / c;
        System.out.println("e) a / c = " + resultE);

        int resultF = a % c;
        System.out.println("f) a % c = " + resultF);

        double resultG = (double) (a * b) / c;
        System.out.println("g) a * b / c = " + resultG);

        double resultH = a * ((double) b / c);
        System.out.println("h) a * (b / c) = " + resultH);

        int resultI = (a * c) % b;
        System.out.println("i) (a * c) % b = " + resultI);

        int resultJ = a * (c % b);
        System.out.println("j) a * (c % b) = " + resultJ);

        int resultK = (3 * a - 2 * b) % (2 * a - c);
        System.out.println("k) (3 * a - 2 * b) % (2 * a - c) = " + resultK);

        int resultL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        System.out.println("l) 2 * (a / 5 + (4 - b * 3)) % (a + c - 2) = " + resultL);

        double resultM = (double) ((a - 3 * b) % (c + 2 * a)) / (a - c);
        System.out.println("m) (a - 3 * b) % (c + 2 * a) / (a - c) = " + resultM);

        int resultN = a - b - c * 2;
        System.out.println("n) a - b - c * 2 = " + resultN);

    }

}
