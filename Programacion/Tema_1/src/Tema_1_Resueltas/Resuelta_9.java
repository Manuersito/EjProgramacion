package Tema_1_Resueltas;

import java.util.Scanner;

public class Resuelta_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Escriba un numero");
		numero = sc.nextInt();
		boolean esPar = numero%2 == 0;
		System.out.println("Es par el numero? "+ esPar);
	}

}
