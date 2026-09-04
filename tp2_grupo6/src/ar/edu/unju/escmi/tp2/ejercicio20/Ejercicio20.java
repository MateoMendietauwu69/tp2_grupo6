package ar.edu.unju.escmi.tp2.ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {

        String textoOriginal = "Hoja";

        String textoModificado = textoOriginal.replace("ja", "la");

        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto modificado: " + textoModificado);

    }
}
//El valor de textoOriginal no cambia porque el metodo .replace no modifica esa variable
//solo devuelve una nueva cadena de texto modificada que se guarda en textoModificado