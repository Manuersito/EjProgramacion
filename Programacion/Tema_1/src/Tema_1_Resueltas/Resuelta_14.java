package Tema_1_Resueltas;

import java.util.Locale;
import java.util.Scanner;

public class Resuelta_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n;
		int redondeo;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.print("Escriba un número decimal (con punto): ");
		n = sc.nextDouble();
		redondeo = (int) (n + 0.5);
		System.out.println(n + " redondeado es: " + redondeo);
	}

}
