package App;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class prop_eva_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String letras;
		String numeros;
		
		 try (BufferedReader in = new BufferedReader(new FileReader("matriculasDesordenada.txt"));
	             BufferedWriter out = new BufferedWriter(new FileWriter("matriculasOrdenada.txt"))) {

	            String line;
	            while ((line = in.readLine()) != null) {
	                if (validarMatricula(line)) {
	                    out.write(line);
	                    out.newLine();
	                }
	            }
	            System.out.println("Se han filtrado las matrículas correctamente.");

	        } catch (IOException e) {
	            System.out.println("Error al procesar el archivo: " + e.getMessage());
	        }
	    }

	
		public static boolean validarMatricula(String matricula) {
	        // Verificar la longitud de la matrícula
	        if (matricula.length() != 8)
	            return false;

	        // Verificar las letras
	        for (int i = 0; i < 3; i++) {
	            char c = matricula.charAt(i);
	            if (!(Character.isLetter(c) && Character.isUpperCase(c) && !esVocal(c)))
	                return false;
	        }

	        // Verificar los dígitos
	        for (int i = 4; i < 8; i++) {
	            char c = matricula.charAt(i);
	            if (!Character.isDigit(c))
	                return false;
	        }

	        // Verificar el espacio en blanco
	        if (matricula.charAt(3) != ' ')
	            return false;

	        return true;
	    }
	
	public static boolean esVocal(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
