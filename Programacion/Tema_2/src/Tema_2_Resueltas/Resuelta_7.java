package Tema_2_Resueltas;

import java.util.Scanner;

public class Resuelta_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un número:");

		int n = sc.nextInt();

		System.out.println("Dame otro número:");

		int m = sc.nextInt();
		
		System.out.println("Dame otro número:");

		int c = sc.nextInt();
		
		if(n>m && n>c){
			System.out.println("El mayor es:" + n);
		}else {
			if(m>n && m>c) {
				System.out.println("El mayor es:" + m);
			}else {
				System.out.println("El mayor es:" + c);
			}
		}
	}

}
