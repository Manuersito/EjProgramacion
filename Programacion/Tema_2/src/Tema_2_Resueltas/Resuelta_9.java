package Tema_2_Resueltas;

import java.util.*;

public class Resuelta_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//nº cifras de un número entre 0 y 99999
		System.out.println("Dame un número entre 0 y 99999");

		int a = sc.nextInt();

		if (a < 10) {
			System.out.println(a + "Tiene una cifra");
		} else {
			if (a < 100) {
				System.out.println(a + "Tiene dos cifras");
			} else {
				if (a < 1000) {
					System.out.println(a + "Tiene tres cifras");
				} else {
					if (a < 10000) {
						System.out.println(a + "Tiene cuatro cifras");
					} else {
						if (a < 100000) {
							System.out.println(a + "Tiene cinco cifras");
						}
					}
				}
			}
		}
	}

}
