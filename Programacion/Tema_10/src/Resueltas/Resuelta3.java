package Resueltas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resuelta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "";
        BufferedReader in = null;  // Declaramos el objeto BufferedReader fuera del bloque try-catch para que sea accesible también desde fuera

        try {
            in = new BufferedReader(new FileReader("Main.txt"));  // Abrimos el archivo Main.java en modo lectura
            String linea = in.readLine();  // Leemos la primera línea del archivo
            while (linea != null) {  // Mientras no lleguemos al final del archivo
                texto = texto + linea + '\n';  // Añadimos la línea leída al texto y agregamos un salto de línea
                linea = in.readLine();  // Leemos la siguiente línea
            }
        } catch (IOException ex) {  // Si se produce una excepción, imprimir un mensaje con la descripción del error
            System.out.println(ex.getMessage());
        } finally {  // En cualquier caso, cerramos el flujo de lectura del archivo
            if (in != null) {  // Si el flujo está abierto
                try {
                    in.close();  // Cerramos el flujo
                } catch (IOException ex) {  // Si se produce una excepción, imprimir un mensaje con la descripción del error
                    System.out.println(ex);
                }
            }
        }

        System.out.println(texto);  // Mostramos el texto leído desde el archivo
	}

}
