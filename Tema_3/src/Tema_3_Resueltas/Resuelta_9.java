package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		
			
		do {
			System.out.println("Escribe un numero entre 1 y 10");
			n=sc.nextInt();
		} while (!(n>=0 && n<=10));
		for (int i = 1; i <= 10; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}

}
