package Tema_2_Resueltas;

import java.util.Scanner;

public class Resuelta_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		if (-1 < n && n < 1 && n != 0) {
			System.out.println("Es un número casi-cero");
		} else {
			System.out.println("No es un casi-cero");
		}
	}

}
