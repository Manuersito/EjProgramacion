package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int n;
	    int suma;
	    int multiplo;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Escribe un numero entero: ");
	    m = sc.nextInt();
	    System.out.println("¿A que multiplo lo quieres?");
	    n = sc.nextInt();
	    multiplo = m % n;
	    suma =n-multiplo;
	    System.out.println("para que sea multiplo de "+m+" hay  que sumar: "+suma);
	}

}
