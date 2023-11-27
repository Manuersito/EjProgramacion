package Act4;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = new int [10];
		boolean encontrado;
		rellenar(t);
		listado(t);
		encontrado = buscar(t);
		
		if(encontrado == true) {
			System.out.println("Se ha encontrado el valor");
			desplazar(t);
			listado(t);

		}else {
			System.out.println("El valor no se encuentra");
		}
		


	}
	
	static void rellenar(int[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 100);
		}
	}
	
	static boolean buscar(int[] t) {
		Scanner sc = new Scanner(System.in);
		boolean encontrado = false;
		int n;
		
		do {
			System.out.println("Numero a buscar(de 1 a 100): ");
			n = sc.nextInt();
			
			if(n < 1 || n > 100) {
				System.out.println("El numero no se encuentra en el rango");
			}
			
		}while(n < 1 || n > 100);
		
		for (int i = 0; i < t.length && !encontrado; i++) {
			if(t[i] == n) {
				encontrado = true;
			}
		}
		
		return encontrado;
	}
	
	static void listado(int[] t) {
		System.out.print("[");
		
		for (int i = 0; i < t.length; i++) {
			if(i < t.length - 1) {
				System.out.print(t[i] + ", ");
			}else {
				System.out.print(t[i] + "]");
			}
		}
		System.out.println();
	}
	
	static void desplazar(int[] t) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] copia = new int[10];
		
		for (int i = 0; i < t.length; i++) {
			copia[i] = t[i];
		}
		
		do {
		System.out.println("Posiciones a desplazar:");
		n = sc.nextInt();
		
		if(n < 1) {
			System.out.println("Numero no valido:");
		}
		
		if(n > t.length - 1) {
			n = n - t.length;
		}
		}while(n < 1);
		
		for (int i = 0; i < t.length; i++) {
			if(i + n > t.length - 1) {
				int aux = (i + n) - t.length;
				t[aux] = copia[i];
			}else {
			t[i + n] = copia[i];
			}
		}
		
	}

}
