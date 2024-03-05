package Resueltas;


	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Resuelta1 {
	

	    // Método para leer un entero desde la entrada estándar
	    static Integer leerEntero() {
	        Integer resultado;
	        while (true) {  // Bucle infinito
	            try {
	                System.out.print("Introducir entero: ");
	                resultado = new Scanner(System.in).nextInt(); // Lee el entero desde la entrada estándar
	                break;  // Si se lee correctamente, salir del bucle
	            } catch (InputMismatchException ex) {  // Si se produce una excepción, imprimir un mensaje y continuar el bucle
	                System.out.println("Tipo erróneo");
	            }
	        }
	        return resultado;  // Devuelve el entero leído
	    }

	}


