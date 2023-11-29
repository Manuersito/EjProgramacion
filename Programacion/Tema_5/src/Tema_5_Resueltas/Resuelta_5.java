package Tema_5_Resueltas;

import java.util.Arrays;

public class Resuelta_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Ejemplo de uso
	        int longitud = 10;
	        int fin = 100;
	        int[] resultado = rellenaPares(longitud, fin);

	        // Imprimir el resultado
	        System.out.println("Tabla ordenada:");
	        for (int num : resultado) {
	            System.out.print(num + " ");
	        }
	    }

	    static int[] rellenaPares(int longitud, int fin) {
	        // Creamos la tabla con la longitud adecuada
	        int pares[] = new int[longitud];
	        int i = 0; // Indica con qué elemento de la tabla estamos trabajando

	        while (i < pares.length) {
	            // Terminaremos de rellenar la tabla cuando el número de pares sea igual que la longitud de la tabla
	            int num = (int) (Math.random() * fin + 1);
	            if (num % 2 == 0) {
	                // Si es par, lo guardamos en el elemento i
	                pares[i] = num;
	                // Incrementamos el indicador
	                i++;
	            }
	        }

	        // Ahora nos falta ordenar la tabla
	        Arrays.sort(pares);
	        return pares;
	    
	    }

}
