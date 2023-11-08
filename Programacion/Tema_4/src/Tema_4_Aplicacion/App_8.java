package Tema_4_Aplicacion;

import java.util.Scanner;

public class App_8 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Cuantos quieres mostrar? ");
	int mostrar=sc.nextInt();
	System.out.println("Cual es el valor minimo? ");
	int minimo = sc.nextInt();
	System.out.println("Cual es el valor maximo? ");
	int maximo = sc.nextInt();

	randoms(mostrar, minimo, maximo);
		}
		
		public static void randoms(int mostrar,int minimo, int maximo) {
			
			for (int i = 0; i < mostrar; i++) {
				System.out.println((int)(Math.random()*maximo-minimo+1)+minimo);
			}
}
}
