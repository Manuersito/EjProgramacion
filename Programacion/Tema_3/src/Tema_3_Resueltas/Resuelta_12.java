package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int nota;
		int suspensos=0;
		
		for (int i = 1; i <= 5; i++) {
			nota = sc.nextInt();
			if (nota<5) {
				suspensos++;
			}
		}
		System.out.println(suspensos);
	}

}
