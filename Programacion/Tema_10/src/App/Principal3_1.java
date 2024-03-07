package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Principal3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clientes3_1 c;
		Clientes3_1[] tablac = new Clientes3_1[0];
		String DNI,nombreComp,fechaNaci;
		int edad;
		double saldo;
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("clientes.txt"));
			String l = in.readLine();
			
			
		while (l != null ) {
			String [] cliente = l.split(" ");
			
			/*crear cliente aqui*/
			
			
			
			
			
			/*insertar clientes en tabla*/
			tablac = Arrays.copyOf(tablac, tablac.length+1);
			
			
		/*	tablac[tablac.length-1] = l;
*/			
			l = in.readLine();
		}
		} catch (IOException ex) {
			// TODO: handle exception
		}
	}

}
