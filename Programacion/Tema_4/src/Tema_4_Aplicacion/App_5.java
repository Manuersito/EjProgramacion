package Tema_4_Aplicacion;

import java.util.Scanner;

public class App_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca las horas ");
		int h1 = sc.nextInt();
		System.out.println("Introduzca los minutos ");
		int m1 = sc.nextInt();
		System.out.println("Introduzca las horas ");
		int h2 = sc.nextInt();
		System.out.println("Introduzca los minutos ");
		int m2 = sc.nextInt();
		
		System.out.print("El intervalo es: ");
		Intervalo(h1,m1,h2,m2);
	}
public static void Intervalo(int h1,int m1,int h2,int m2) {
	
	int total1,total2,totaltotal,mayor,menor;
	
	total1= (h1*60)+m1;
	total2= (h2*60)+m2;
	
	if (total1>total2) {
		mayor=total1;
		menor=total2;
	} else {
		mayor=total2;
		menor=total1;
	}
	
	
	totaltotal=mayor-menor;
	
	System.out.println(totaltotal+" minutos");
}
	
}
