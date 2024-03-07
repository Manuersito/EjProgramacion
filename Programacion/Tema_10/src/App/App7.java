package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int contLine=0;
		BufferedReader in = null;
		int continuar;
		
		try {
			in = new BufferedReader(new FileReader("App7.txt"));
			String c = in.readLine();
				
			while (c !=null) {
				if (contLine==24) {
					System.out.println("Da Pulsa 1 Para Continuar");
					continuar=sc.nextInt();
					contLine=0;
				}
				contLine++;
				System.out.println(c);
				c=in.readLine();
			}
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		}finally { // En cualquier caso, cerramos el flujo de lectura del archivo
			if (in != null) { // Si el flujo está abierto
				try {
					in.close(); // Cerramos el flujo
				} catch (IOException ex) { // Si se produce una excepción, imprimir un mensaje con la descripción del
											// error
					System.out.println(ex);
				}
			}
		}
		
	}

}
