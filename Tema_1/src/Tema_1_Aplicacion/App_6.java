package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int segundos;
        int minutos;
        int horas;
        System.out.print("Ingrese una cantidad en segundos: ");
        segundos = sc.nextInt();
        horas = segundos/3600;
        minutos = horas/60;
        segundos = minutos/60;
        System.out.println("EN HORAS : " + horas);
        System.out.println("EN MINUTOS : " + minutos);
        System.out.println("EN SEGUNDOS: "+segundos);
		
	}
}
