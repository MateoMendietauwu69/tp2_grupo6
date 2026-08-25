package ar.edu.unju.escmi.tp2.ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1. Dni (int porque es número entero)
		int dni = 42123456;

        // 2. Ejemplar del DNI (char para un único carácter)
        char ejemplarDni = 'A';

        // 3. Edad de familiar ( usamos byte por que va de -128 a 127)
        byte edadMama = 54;

        // 4. Nombres y apellidos de un prócer (String para cadenas de texto)
        String procerNombresYApellidos = "José Francisco de San Martín";

        // 5. Número que puede salir en la jugada de un bingo (byte, por que el bingo va del 1 al 90)
        byte numeroBingo = 75;

        // 6. Precio de un celular (double por los precios en decimales)
        double precioCelular = 850000.50;

        // 7. Estatura expresada en metros (float con sufijo 'f' o double)
        float estaturaMetros = 1.75f;

        // 8. Peso aproximado de la mascota en kilogramos (double o float)
        double pesoMascotaKg = 12.4f;

        // 9. Fecha de inicio del 2do cuatrimestre del presente año (String para formatear la fecha)
        String fechaInicioSegundoCuatrimestre = "10/08/2026";

        // 10. Fecha de finalización del 2do cuatrimestre del presente año (String)
        String fechaFinSegundoCuatrimestre = "27/11/2026";


        // MUESTRA POR CONSOLA CON TEXTO DESCRIPTIVO
        System.out.println("--- INFORMACIÓN REGISTRADA ---");
        System.out.println("Número de DNI: " + dni);
        System.out.println("Ejemplar de DNI: " + ejemplarDni);
        System.out.println("Edad de mi mamá: " + edadMama + " años");
        System.out.println("Prócer importante de Argentina: " + procerNombresYApellidos);
        System.out.println("Número sorteado en el Bingo: " + numeroBingo);
        System.out.println("Precio del celular: $" + precioCelular);
        System.out.println("Estatura: " + estaturaMetros + " metros");
        System.out.println("Peso de la mascota: " + pesoMascotaKg + " kg");
        System.out.println("Fecha de inicio del 2do cuatrimestre: " + fechaInicioSegundoCuatrimestre);
        System.out.println("Fecha de finalización del 2do cuatrimestre: " + fechaFinSegundoCuatrimestre);
		
	}

}
