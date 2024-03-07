package App;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		FileReader in = null; // Declaramos el objeto FileReader fuera del bloque try-catch para que sea
		String x;
		// accesible también desde fuera
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nombre del archivo: ");
			x = sc.nextLine();
			in = new FileReader(x); // Abrimos el archivo Main.java en modo lectura
			int c = in.read(); // Leemos el primer carácter del archivo
			while (c != -1) { // Mientras no lleguemos al final del archivo
				texto = texto + (char) c; // Convertimos el carácter leído a un String y lo añadimos al texto
				c = in.read(); // Leemos el siguiente carácter
			}
		} catch (IOException ex) { // Si se produce una excepción, imprimir un mensaje con la descripción del error
			System.out.println(ex.getMessage());
		} finally { // En cualquier caso, cerramos el flujo de lectura del archivo
			if (in != null) { // Si el flujo está abierto
				try {
					in.close(); // Cerramos el flujo
				} catch (IOException ex) { // Si se produce una excepción, imprimir un mensaje con la descripción del
											// error
					System.out.println(ex);
				}
			}
		}

		System.out.println(texto); // Mostramos el texto leído desde el archivo
	}
}
