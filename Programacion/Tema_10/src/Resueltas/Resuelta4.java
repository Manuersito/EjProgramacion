package Resueltas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resuelta4 {

	public static void main(String[] args) {
		BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("NumerosReales.txt"));  // Abrimos el archivo "NumerosReales.txt" en modo lectura
            String texto = in.readLine();  // Leemos el contenido del archivo y lo almacenamos en la cadena "texto"
            String[] subcadenas = texto.split(" ");  // Separamos las subcadenas utilizando el espacio como delimitador
            double suma = 0;
            for (int i = 0; i < subcadenas.length; i++) {
                suma += Double.valueOf(subcadenas[i]);  // Convertimos cada subcadena a double y las acumulamos en "suma"
            }
            System.out.println("suma: " + suma + "\tmedia: " + suma / subcadenas.length);  // Mostramos la suma y la media de los números en la consola
        } catch (IOException ex) {  // Si se produce una excepción, imprimir un mensaje con la descripción del error
            System.out.println(ex.getMessage());
        } finally {  // En cualquier caso, cerramos el flujo de lectura del archivo
            if (in != null) {  // Si el flujo está abierto
                try {
                    in.close();  // Cerramos el flujo
                } catch (IOException ex) {  // Si se produce una excepción, imprimir un mensaje con la descripción del error
                    System.out.println(ex.getMessage());
                }
            }
        }
    }


	}


