package Tema_4_Aplicacion;

import java.util.Scanner;

public class App_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Intorduce los dias: ");
		int dias=sc.nextInt();
		System.out.println("Intorduce las horas: ");
		int horas = sc.nextInt();
		System.out.println("Intorduce los minutos: ");
		int minutos = sc.nextInt();

System.out.println("La conversion a segundos son: "+convertirSegundos(dias, horas, minutos));
	}
	public static int convertirSegundos(int dias, int horas, int minutos) {
		int segundos;
		
		dias=dias*86400;
		horas=horas*3600;
		minutos=minutos*60;
		
		segundos = dias+horas+minutos;
		return segundos;
		
	}

}
