package ar.edu.unju.escmi.tp2.ejercicio3;

public class Ejercicio3 {

    public static final String CODIGO_POSTAL_JUJUY = "Y4600";
    public static final double VALOR_PI = 3.1415926535;
    public static final int DIAS_SEMANA = 7;
    public static final int MESES_ANIO = 12;

    public static void main(String[] args) {
        System.out.println("Código postal: " + CODIGO_POSTAL_JUJUY);
        System.out.println("Valor de PI: " + VALOR_PI);
        System.out.println("Días de la semana: " + DIAS_SEMANA);
        System.out.println("Meses en un año: " + MESES_ANIO);
    }
}
//rta: no es estrictamente necesario pero es lo mas adecuando se podria decir
//ya que indica que la variable le pertenece a la clase y no a los objetos individuales que se creen a partir de ella