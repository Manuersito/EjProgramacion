package App;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre, edad;
		BufferedWriter out = null;
		String texto = "";

		try {
			out = new BufferedWriter(new FileWriter("datos.txt", true));
			System.out.println("Escribe nombre: ");
			nombre = sc.nextLine();
			String cad = nombre;

			out.write(cad);

			System.out.println("Escribe edad: ");
			edad = sc.nextLine();
			String cad2 = edad;
			out.write(" " + cad2);
			out.newLine();

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException ex) {
					System.out.println(ex);
				}
			}
		}
	}

}
