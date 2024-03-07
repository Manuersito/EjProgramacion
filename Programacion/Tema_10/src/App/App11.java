package App;

import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt = 0;
		Scanner sc = new Scanner(System.in);
		BufferedReader in = null;
		BufferedWriter out = null;
		String[] agenda = new String[20];
		String nombre, telefono;
		int cont = 0;
		try {
			in = new BufferedReader(new FileReader("agenda.txt"));
			String line = in.readLine();
			while (line != null) {
				agenda = Arrays.copyOf(agenda, agenda.length);
				agenda[cont] = line;
				cont++;
				line = in.readLine();
			}
			do {

				System.out.println("1. Nuevo contacto \n2.Buscar por nombre \n3.Mostrar todos \n4.Salir");
				opt = sc.nextInt();
				switch (opt) {
				case 1:
					if (cont == 20) {
						System.out.println("Agenda llena");
					} else {
						nombre = sc.nextLine();
						System.out.println("Escriba un nombre");
						nombre = sc.nextLine();
						System.out.println("Escriba un telefono");
						telefono = sc.nextLine();

						agenda[cont] = "Nombre: " + nombre + " Telefono: " + telefono;
						System.out.println("campo introducido \n " + agenda[cont]);
						cont++;
					}
					break;

				case 2:
					System.out.println("Introduzca Nombre o Telefono: (Puede ser aprox)");
					String buscar=sc.nextLine();
						buscar=sc.nextLine();
						for (int i = 0; i < cont; i++) {
							if (agenda[i].contains(buscar)) {
								System.out.println(agenda[i]);
							}
							
						}
					
					break;

				case 3:
					
					for (int i = 0; i < cont; i++) {
						System.out.println(agenda[i]);

					}
					break;

				case 4:
					try {
						out = new BufferedWriter(new FileWriter("agenda.txt"));
						for (int i = 0; i < cont; i++) {
							out.write(agenda[i]);
							out.newLine();
						}

					} catch (IOException ex) {
						// TODO: handle exception
						System.out.println(ex.getMessage());
					} finally {
						if (out != null) {

							try {
								out.close();
							} catch (IOException ex) {
								// TODO: handle exception
								System.out.println(ex);
							}
						}
					}

					break;

				default:
					break;
				}

			} while (opt != 4);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		} finally {
			if (in != null) {

				try {
					in.close();
				} catch (IOException ex) {
					// TODO: handle exception
					System.out.println(ex);
				}
			}
		}

	}

}
