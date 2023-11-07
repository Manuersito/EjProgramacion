package Tema_4_Resueltas;

import java.util.*;

public class Resuelta_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		int a = sc.nextInt();
		System.out.println("Escribe el segundo numero");
		int b = sc.nextInt();
		
		comprendidos(a,b);
	}

	public static void comprendidos(int a, int b) {
		int mayor,menor;
		if (a>b) {
			mayor=a;
			menor=b;
		} else {
			menor=a;
			mayor=b;
		}
		
		for (int i = menor+1; i < mayor; i++) {
			System.out.println("el numero "+i+" esta comprendido entre "+menor+" y "+mayor);
		}
	}
}
