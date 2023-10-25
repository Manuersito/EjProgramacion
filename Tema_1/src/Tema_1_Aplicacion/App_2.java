package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entero;
	    int suma;
	    int multiplo;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Escribe un numero entero: ");
	    entero = sc.nextInt();
	    multiplo = entero % 7;
	    suma =7-multiplo;
	    System.out.println("para que sea multiplo de 7 hay  que sumar: "+suma);
	}
}
