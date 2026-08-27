package ar.edu.unju.escmi.tp2.ejercicio19;

public class Ejercicio19 {
    public static void main(String[] args){
        String texto1 = "Hello";
        String texto2 = "Hello";
        System.out.println(texto1==texto2);
        System.out.println(texto1.equals(texto2));
        String texto3 = new String("Hello");
        System.out.println(texto1==texto3);
        System.out.println(texto1.equals(texto3));
        /*  ¿Por qué texto1 == texto2 devuelve true? 
                devuelve true porque al usar == compara la direccion de memoria y texto1 y texto2 tienen la misma direccion; 
                mientras que .equals compara el contenido del texto, los caracteres que lo forman.
            ¿Por qué texto1 == texto3 devuelve false? 
                porque con new string se esta creando un nuevo objeto en la memoria por lo cual tiene una direccion de memoria diferente. */
    }
}
