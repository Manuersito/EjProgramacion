package Tema_7_Resuelta_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hora r = new Hora(11,30);
		System.out.println(r);
		for (int i = 0; i < 61; i++) {
			r.inc();
		}
		
		System.out.println(r);
		System.out.println("Escriba una hora");
		int hora = new Scanner(System.in).nextInt();
		boolean cambio = r.setHora(hora);
		if (cambio) {
			System.out.println(r);
		} else {
			System.out.println("La hora no pudo cambiarse");
		}
		
	}

}
