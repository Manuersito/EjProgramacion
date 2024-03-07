package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.type.ArrayType;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
		BufferedReader in = null; // Declaramos el objeto FileReader fuera del bloque try-catch para que sea
		int x = 0;
		int[]tabla1 = new int[0];
		int[]tabla2 = new int[0];
		int[]tabla3 = new int[0];
		// accesible también desde fuera
		try {
			Scanner sc = new Scanner(System.in);
			in = new BufferedReader(new FileReader("App3_1.txt"));
			String c = in.readLine(); 
			while (c != null ) { 
				sc=new Scanner(c);
				tabla1=Arrays.copyOf(tabla1, tabla1.length+1); 
				tabla1[tabla1.length-1]=sc.nextInt();
				c = in.readLine(); 
			}
			
			in = new BufferedReader(new FileReader("App3_1.txt")); 
			String c1 = in.readLine(); // 
			while (c1 != null ) { 
				sc=new Scanner(c1);
				tabla2=Arrays.copyOf(tabla2, tabla2.length+1); 
				tabla2[tabla2.length-1]=sc.nextInt();
				c1 = in.readLine(); 
			}
			
			System.arraycopy(tabla1,0,tabla3,0,tabla1.length);
			System.arraycopy(tabla2,0,tabla3,tabla1.length,tabla2.length);
			Arrays.sort(tabla3);
			Arrays.toString(tabla3);
			
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

		System.out.println(tabla3); // Mostramos el texto leído desde el archivo
	}

}
