package Tema_1_Resueltas;

import java.util.Scanner;

public class Resuelta_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1, nota2, nota3; 
		int mediaBoletin; 
		double mediaExpediente;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Nota primer trimestre: ");
		nota1 = sc.nextInt();
		System.out.print("Nota segundo trimestre: ");
		nota2 = sc.nextInt(); 
		System.out.print("Nota tercer trimestre: ");
		nota3 = sc.nextInt();
		mediaExpediente = (nota1 + nota2 + nota3) / 3.0;
		mediaBoletin = (int) mediaExpediente;
		System.out.println("Boletín de calificaciones: " + mediaBoletin);
		System.out.println("Expediente académico: " + mediaExpediente);
	}

}
