package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hormigas, arañas, cochinitas, suma;
		System.out.println("numero de hormigas");
		hormigas = sc.nextInt();
		System.out.println("numero de arañas");
		arañas = sc.nextInt();
		System.out.println("numero de cochinitas");
		cochinitas = sc.nextInt();

		suma = (hormigas * 6) + (arañas * 8) + (cochinitas * 14);

		System.out.println("el numero de patas total es: " + suma);

	}

}
