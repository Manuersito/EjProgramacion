package Tema_3_Ampliacion;

import java.util.Scanner;

public class Amp_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escribe un numero impar");
			lado=sc.nextInt();
		} while (lado%2!=1); {
		
		for (int i = 1; i <= lado-1; i+=2) {
			for (int j = 0; j < lado-i; j++) {
				System.out.print(" ");
				}
			for (int k = 1; k<=i; k++) {
				System.out.print("* ");
			}			
			
			System.out.println("");
	}
		 for (int i = lado; i >= 0; i-=2) {
	            for (int j = 0; j < lado-i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k<=i; k++) {
	                System.out.print("* ");
	            }       
	            System.out.println("");   
	        }
		 
		 
		
		}

	}

}
