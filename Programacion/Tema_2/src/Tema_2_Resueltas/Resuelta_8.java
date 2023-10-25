package Tema_2_Resueltas;

import java.util.*;

import java.math.*;

public class Resuelta_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame la a:");

		int a = sc.nextInt();

		System.out.println("Dame la b:");

		int b = sc.nextInt();
		
		System.out.println("Dame la c:");

		int c = sc.nextInt();
		
		double d = (b * b - 4 * a * c);
		
		if (d<0){
			System.out.println("No existe solución real");
		} else {
			if (a==0) {
				System.out.println("No es un ecuación de segundo grado");
			}else {
				double x1 = -b - Math.sqrt(d)/2 * a;
				
				double x2 = -b + Math.sqrt(d)/2 * a;
				
				System.out.println("La solución 1 es:" + x1 + "La solución 2 es:" + x2);
			}
		}

	}

}
