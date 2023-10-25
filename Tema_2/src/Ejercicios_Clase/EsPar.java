package Ejercicios_Clase;

import java.util.Scanner;

public class EsPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean esPar;
		int a;
		System.out.print("Escriba un numero: ");
		a = sc.nextInt();
		if (a % 2 == 0) {
			esPar = true;
			System.out.println(esPar);
		} else {
			esPar = false;
			System.out.println(esPar);
		}
	}

}
