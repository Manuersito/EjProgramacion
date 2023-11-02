package Tema_4_Resueltas;

import java.util.Scanner;

public class Resuelta_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe cuantas veces quieres que se repita eco...");
		int n = sc.nextInt();
		System.out.println("Antes de la llamada");
		System.out.println("");
		eco(n);
	}
	public static void eco(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("eco...");
		}
	}
}
