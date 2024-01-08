package Tema_5_Propuestas_Profesora;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sopa_de_letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tablero = new char[15][15];
		String[] palabras = { "DORMIR", "CALMARLA", "KIFI", "TOCADO", "GRIPAO", "DIABOLICO", "MANUBRIO", "TRISTE" };
		int cont = 0;
		rellenarMatrizAleatoria(tablero);

		do {
			imprimirMatriz(tablero);
			String intento = intentos(); ;
			comprobarPalabra(palabras, cont, intento);
		} while (cont != 8);
	}

	private static void rellenarMatrizAleatoria(char[][] matriz) {
		Random random = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// Generar letra aleatoria del abecedario
				char letra = (char) ('A' + random.nextInt(26));
				matriz[i][j] = letra;
			}
		}
	}

	private static void imprimirMatriz(char[][] matriz) {
		// TODO Auto-generated method stub
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static int comprobarPalabra(String palabra[], int cont, String intento) {
		// TODO Auto-generated method stub
		boolean estaEnArray = false;
		for (String cadena : palabra) {
			if (cadena.equals(intento)) {
				estaEnArray = true;
				break;
			}
		}

		if (estaEnArray) {
			System.out.println(intento + " es correcto");
			cont++;
		} else {
			System.out.println(intento + " no es correcto, intentelo de nuevo.");
			
		}
		return cont;
	}

	private static String intentos() {
		// TODO Auto-generated method stub
		String intento;
		Scanner sc = new Scanner(System.in);
		intento = sc.nextLine();
		return intento;
	}
}
