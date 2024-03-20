package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class prop_eva_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("De que tamaño quieres que separe palabras?");
		int p=datoTeclado();
		try (BufferedReader in = new BufferedReader(new FileReader("Palabras.txt"))){
		Scanner leer = new Scanner(in);
		
		FileWriter menores = new FileWriter("menores.txt");
		FileWriter mayores = new FileWriter("mayores.txt");
		
		
		while (leer.hasNext()) {
			String palabra = leer.next();
			System.out.println(palabra);
			if (palabra.length() <= p) {
			menores.write(palabra + " ");	
			} else {
			mayores.write(palabra + " ");
			}
			
		}
		menores.close();
		mayores.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public static int datoTeclado() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}
}
