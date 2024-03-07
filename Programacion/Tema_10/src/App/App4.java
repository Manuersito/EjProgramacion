package App;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class App4 {
	


	public class Aplicacion4 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FileInputStream flujo = null;
			try {
				flujo = new FileInputStream("Carta.txt");
			} catch (FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
			try (BufferedReader in = new BufferedReader(new FileReader("Carta.txt"))) {
				Scanner sc = new Scanner(flujo);
				String[] palabras = new String[0];
				String palabra = sc.next();
				while (sc.hasNext()) {
					palabras = Arrays.copyOf(palabras, palabras.length + 1);
					palabras[palabras.length - 1] = palabra;
					palabra = sc.next();
				}
				System.out.println(Arrays.toString(palabras));
				System.out.println("Numero de palabras: " + palabras.length);
				int caracteres = 0;
				for (int i = 0; i < palabras.length; i++) {
					caracteres += palabras[i].length();
				}
				System.out.println("Número de caracteres: " + caracteres);
				int numLineas = 0;
				while (sc.hasNextLine()) {
					numLineas++;
				}
				System.out.println("Número de líneas: " + numLineas);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
