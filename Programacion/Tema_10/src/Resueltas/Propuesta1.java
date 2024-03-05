package Resueltas;

import java.io.FileReader;
import java.io.IOException;

public class Propuesta1 {

	 public static void main(String[] args) {
        String texto="";
        FileReader in = null;

        try {
            in = new FileReader("Main.txt");
            int c=in.read();
            while (c != -1) {
                texto=texto+(char)c;
                c=in.read();
            }

        } catch (IOException ex) {
            // TODO: handle exception
            System.out.println(ex.getMessage());
            
        }finally {  // En cualquier caso, cerramos el flujo de lectura del archivo
            if (in != null) {  // Si el flujo está abierto
                try {
                    in.close();  // Cerramos el flujo
                } catch (IOException ex) {  // Si se produce una excepción, imprimir un mensaje con la descripción del error
                    System.out.println(ex);
                }
            }
        }

        System.out.println(texto);
    }

}
