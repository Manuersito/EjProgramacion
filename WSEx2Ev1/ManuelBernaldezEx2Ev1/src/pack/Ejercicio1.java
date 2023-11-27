package pack;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int n = 0, k = 0;
		System.out.println("Que tamaño quieres de vector?");
		n = sc();
		int[] v = new int[n];
		rellenar(v);
		
		

		
		// inicio primer ejercicio
		System.out.println("Vector original: ");
		imprimirVector(v);
		System.out.println();

		rotarDerecha(v, k);

		System.out.println("Vector rotado hacia la derecha: ");
		imprimirVector(v);
		System.out.println();
		// fin primer ejercicio
		
		
		
		
		//inicio segundo ejercicio
		System.out.println();
		System.out.println("Vector original: ");
		imprimirVector(v);
		System.out.println();
		eliminarDuplicados(v);
		System.out.println();
		//fin segundo ejercicio
		
		
		
		
		
		
		//inicio tercer ejercicio
		System.out.println("vector original");
		imprimirVector(v);
		System.out.println();
		ordenar(v, k);
		System.out.println("vector ordenador");
		imprimirVector(v);
		System.out.println();
		System.out.println();
		//fin tercer ejercicio
		
		
		
		
		
		
		//inicio cuarto ejercicio
		//muestra que si coincide
		int[] v1 =  {1,2,3,5,8,7,4,0,0};
		
		int[] v2 = {8,7,4};
		
		
		System.out.println("vector 1");
		imprimirVector(v1);
		System.out.println();
		System.out.println("vector 2");
		imprimirVector(v2);
		System.out.println();
		System.out.println(buscarSubsecuencia(v1, v2));
	}

	
	
	
	// Metodo para rotar hacia la derecha
	static int[] rotarDerecha(int[] vector, int k) {
		System.out.println("Cuantas posiciones quieres rotar?");
		k = sc();
		for (int r = 0; r < k; r++) {
			int ultimoElemento = vector[vector.length - 1];

			for (int i = vector.length - 1; i > 0; i--) {
				vector[i] = vector[i - 1];
			}

			vector[0] = ultimoElemento;
		}
		return vector;
	}

	
	
	
	
	// Metodo para imprimir un vector
	static void imprimirVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}
	}

	// Metodo para ordenar parcialmente
	public static int[] ordenar(int[] vector, int k) {
		int i, j, aux;
		System.out.println("cuantas posiciones quieres ordenar?");
		k = sc();
		for (i = 0; i < k - 1; i++) {
			for (j = 0; j < k - i - 1; j++) {
				if (vector[j + 1] < vector[j]) {
					aux = vector[j + 1];
					vector[j + 1] = vector[j];
					vector[j] = aux;
				}
			}
		}

		return vector;

	}
	
	
	//Metodo de que un vector esta dentro de otro
	
	static boolean buscarSubsecuencia(int[] v1, int[] v2) {
		for (int i = 0; i <= v1.length - v2.length; i++) {
            boolean coincide = true;

            for (int j = 0; j < v2.length; j++) {
                if (v1[i + j] != v2[j]) {
                    coincide = false;
                    break;
                }
            }

            if (coincide) {
                return true;
            }
        }

        return false;
    }

	
	
	
	// Metodo para introducir por teclado
	public static int sc() {
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		return op;
	}

	
	
	
	// Metodo para rellenar el array
	static void rellenar(int[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 10 + 1);
		}
	}
	
	
	//Metodo para eliminar los duplicados
	public static void eliminarDuplicados(int[] vector) {
        int cont = 0;
        int longitud = vector.length;

        for (int i = 0; i < longitud; i++) {
            for (int j = i + 1; j < longitud; j++) {
                if (vector[i] == vector[j]) {
                    //Si encuentra un elemento añade 1 al contador
                    cont++;

                    // Mueve los elementos hacia la izquierda para quitar el duplicado
                    for (int k = j; k < longitud-1; k++) {
                        vector[k] = vector[k + 1];
                    }
                    
                    longitud--;
                    
                    j--;
                    
                }
            }
        }
        
        System.out.println("se han eliminado "+cont+" elementos del array ");
    }
	
}
