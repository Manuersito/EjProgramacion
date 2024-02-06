package Tema_5_Propuestas_Profesora;


import java.util.Random;
import java.util.Scanner;

public class sopa_de_letras {

	public static void main(String[] args) {
		char[][] tablero = new char[15][15];
		String[] palabras = { "DORMIR", "CALMARLA", "KIFI", "TOCADO", "GRIPAO", "DIABOLICO", "MANUBRIO", "TRISTE" };		int cont = 0;
		rellenarMatrizAleatoria(tablero);
		rellenarMatrizConPalabras(tablero, palabras);
		do {
			imprimirMatriz(tablero);
			System.out.println();
			String intento = intentos(); ;
			cont=comprobarPalabra(palabras, cont, intento);
			System.out.println();
			System.out.println(cont);
			System.out.println();
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
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static int comprobarPalabra(String palabra[], int cont, String intento) {
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

	private static void rellenarMatrizConPalabras(char[][] matriz, String[] palabras) {
        Random random = new Random();

        for (String palabra : palabras) {
            
            int fila = random.nextInt(matriz.length);
            int columna = random.nextInt(matriz[0].length - palabra.length() + 1);

            
            if (columna >= 0 && columna + palabra.length() <= matriz[0].length) {
                
                for (int i = 0; i < palabra.length(); i++) {
                    matriz[fila][columna + i] = palabra.charAt(i);
                }
            } else {
                
                rellenarMatrizConPalabras(matriz, palabras);
            }
        }
    }

	
	private static String intentos() {
		// TODO Auto-generated method stub
		String intento;
		Scanner sc = new Scanner(System.in);
		intento = sc.nextLine();
		return intento;
	}
}
