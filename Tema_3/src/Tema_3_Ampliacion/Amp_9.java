package Tema_3_Ampliacion;

import java.util.Scanner;

public class Amp_9 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int lado;
	do {
		System.out.println("Escribe un numero impar");
		lado=sc.nextInt();
	} while (lado%2!=1);
	for (int i = lado; i > 1; i-=2) {
        for (int j = 0; j < lado-i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k<=i; k++) {
           if (k==1||k==i) {
        	   System.out.print("* ");
		} else {
			System.out.print("  ");
		}
        }       
        System.out.println("");   
    }
	for (int i = 1; i <= lado; i+=2) {
		for (int j = 0; j < lado-i; j++) {
			System.out.print(" ");
			}
		for (int k = 1; k<=i; k++) {
			if (k==1||k==i) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
		}			
		
		System.out.println("");
}
}
}
