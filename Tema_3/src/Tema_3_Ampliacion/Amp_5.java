package Tema_3_Ampliacion;

import java.util.Iterator;
import java.util.Scanner;

public class Amp_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,i;
		System.out.println("Escribe un numero: ");
		num = sc.nextInt();
		boolean esPrimo = true;
		for ( i = num; i < num+5; i++) {
			for (int j = 2; j < i-1 && esPrimo; j++) {
				if (i%j==0) {
					esPrimo=false;
				} 
			}
			if (esPrimo) {
				System.out.println(i+" esPrimo");
			} else {
				System.out.println(i+" no esPrimo");
			}
			esPrimo=true;
		}
			
		}
	}
		
		
	

