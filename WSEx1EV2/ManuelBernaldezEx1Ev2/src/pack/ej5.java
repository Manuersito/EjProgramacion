package pack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int RANGINF = 1;
		int RANGSUP = 8;
		// primer metodo en las variables de arriba cambias los valores de rango
		int[][] v = generaArrayBiInt(RANGINF, RANGSUP);

		// segundo metodo
		System.out.println("Introduce el numero de la fila que quieres ver");
		int fila = sc();
		filaDeArrayBiInt(v, fila);

		// tercer metodo
		System.out.println("Introduce el numero de la columna que quieres ver");
		int col = sc();
		colDeArrayBiInt(v, col);

		// cuarto metodo
		int[] a = new int[2];
		System.out.println("Que numero quieres buscar");
		int numBusq = sc();
		a = coordenadasEnArrayBiInt(v, numBusq);
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		//quinto metodo
		minimosPorColumnas(v);
		
	}

	// parte 1.
	static int[][] generaArrayBiInt(int inf, int sup) {
		int NFILAS, NCOL;
		System.out.println("Cuantas filas quieres?");
		NFILAS = sc();
		System.out.println("Cuantas columnas quieres?");
		NCOL = sc();
		int[][] v = new int[NFILAS][NCOL];

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				v[i][j] = (int) (Math.random() * (sup - inf + 1)) + inf;
			}
		}

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j]);
			}
			System.out.println("");
		}

		return v;
	}
	// parte 2.

	static int[] filaDeArrayBiInt(int[][] v, int fila) {
		int[] a = new int[v.length];

		for (int j = 0; j < v.length; j++) {
			a[j] = v[fila][j];
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println(" ");
		return a;
	}

//parte 3
	static int[] colDeArrayBiInt(int[][] v, int col) {
		int[] a = new int[v.length];

		for (int j = 0; j < v.length; j++) {
			a[j] = v[j][col];
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		return a;
	}

	// parte 4
	static int[] coordenadasEnArrayBiInt(int[][] v, int numBusq) {
		int[] coordenadas = { -1, -1 };

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				if (v[i][j] == numBusq) {
					coordenadas[0] = i;
					coordenadas[1] = j;
					return coordenadas;
				}
			}
		}

		return coordenadas;
	}

	//parte 5
	static void minimosPorColumnas(int[][] v) {
        int filas = v.length;
        int columnas = v[0].length;

        for (int j = 0; j < columnas; j++) {
            int minimo = v[0][j];

            for (int i = 1; i < filas; i++) {
                if (v[i][j] < minimo) {
                    minimo = v[i][j];
                }
            }

            System.out.println("Mínimo de la columna " + j + ": " + minimo);
        }
    }
	
	static int sc() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		return n;
	}

}