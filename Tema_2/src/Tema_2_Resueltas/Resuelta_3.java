package Tema_2_Resueltas;

import java.util.Scanner;

public class Resuelta_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		System.out.println("Introduzca numero 1");
		n1 = sc.nextInt();
		System.out.println("Introduzca numero 2");
		n2 = sc.nextInt();
		if (n1>n2) {
			System.out.println("El numero 1 es mayor");
		}else {
			System.out.println("El numero 2 es mayor");
		}
	}

}
