package Tema_1_Resueltas;

import java.util.Scanner;

public class Resuelta_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PRECIO_MANZANA = 2.35;
		final double PRECIO_PERA = 1.95;
		int vManz1Sem, vManz2Sem;
		int vPera1Sem, vPera2Sem;
		double impTotal;
		Scanner sc = new Scanner(System.in) ;
			System.out.println("Para las manzanas: ");
			System.out.print("ventas (en kilos) del primer semestre: ");
			vManz1Sem = sc.nextInt();
			System.out.print("ventas (en kilos) del segundo semestre: ");
			vManz2Sem = sc.nextInt();
			System.out.println("Para las peras: ");
			System.out.print("ventas (en kilos) del primer semestre: ");
			vPera1Sem = sc.nextInt();
			System.out.print("ventas (en kilos) del segundo semestre: ");
			vPera2Sem = sc.nextInt();
		
		impTotal = (vManz1Sem + vManz2Sem)  * PRECIO_MANZANA;
		impTotal += (vPera1Sem + vPera2Sem)  * PRECIO_PERA;
		System.out.println("El importe total es de: "+impTotal+ "euros.");
	}

}
