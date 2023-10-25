package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		double x;
		double suma;
		System.out.println("Escriba valor de a: ");
		a = sc.nextDouble();
		System.out.println("Escriba valor de b: ");
		b = sc.nextDouble();
		System.out.println("Escriba valor de c: ");
		c = sc.nextDouble();
		System.out.println("Escriba valor de x: ");
		x = sc.nextDouble();
		suma = (a * (x * x)) + (b * x) + c;
		System.out.println("El valor de y es:" + suma);
	}
}
