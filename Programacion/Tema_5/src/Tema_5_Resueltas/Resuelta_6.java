package Tema_5_Resueltas;

import java.util.Arrays;

public class Resuelta_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] apuesta = {3, 7, 12, 15, 22};
        int[] combinacionGanadora = {7, 12, 15, 20, 25};
        int aciertos = contarAciertos(apuesta, combinacionGanadora);

        // Imprimir el resultado
        System.out.println("Número de aciertos: " + aciertos);
    }

    static int contarAciertos(int[] apuesta, int[] combinacionGanadora) {
        int aciertos = 0; // Contador de aciertos

        // Recorremos la tabla de apuesta
        for (int a : apuesta) {
            // Aprovechamos que la tabla con la combinación está ordenada
            if (Arrays.binarySearch(combinacionGanadora, a) >= 0) {
                // Si está, hemos acertado un número más
                aciertos++;
            }
        }

        return aciertos;
	}

}
