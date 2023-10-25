package Tema_1_Resueltas;

import java.util.Scanner;

public class Resuelta_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int nota1,nota2;
		double media;
		
		System.out.println("Escribra nota 1");
		nota1=sc.nextInt();
		
		System.out.println("Escribra nota 2");
		nota2=sc.nextInt();
		
		System.out.println(media(nota1, nota2));
		}
	public static double media(int nota1, int nota2) {
		double media = (double)(nota1 + nota2)/2;
		
		return media;
	}

}
