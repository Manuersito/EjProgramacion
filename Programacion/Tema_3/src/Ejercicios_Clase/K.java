package Ejercicios_Clase;

public class K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado = 11;
		for (int i = lado/2+1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int i = 1; i < lado/2+1; i++) {
			for (int j = 0; j < i+1; j++) {
			System.out.print("* ");	
			}
			
			System.out.println("");
			}
		}
	}


