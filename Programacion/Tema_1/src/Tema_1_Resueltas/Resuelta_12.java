package Tema_1_Resueltas;

import java.util.Scanner;

public class Resuelta_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número (Positivo o negativo):");
		int n;
		n = sc.nextInt();
		int valorAbsoluto;
		valorAbsoluto = Math.abs(n);
		System.out.println("El valor absoluto de " +n+ " es: " +valorAbsoluto);
	}

}
