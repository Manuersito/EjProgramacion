package Tema_4_Aplicacion;

import java.util.Scanner;

public class App_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("hasta que nuemero quieres ver los pares: ");
		int n = sc.nextInt();
		pares(n);
		}
	
	
	
	
	public static void pares(int n) {
		int num=0;
		for (int i = 0; i < n; i++) {
			 System.out.println(num);
	            num += 2;
		}
		
		
		
	}
}
