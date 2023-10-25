package Tema_2_Aplicacion;

import java.util.*;

public class App_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int comidaDiaria, numAnimales;
		double kilosPorAnimal;
		boolean suficiente;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Cantidad de comida comprada: ");
		comidaDiaria = sc.nextInt();
		System.out.println("Numero de animales: ");
		numAnimales = sc.nextInt();
		if (numAnimales == 0) {
			System.out.println("Error");
			System.out.println("Numero de animales: ");
			numAnimales = sc.nextInt();
		}
		System.out.println("Cada animal come una media de: ");
		kilosPorAnimal = sc.nextDouble();
		
		if ((comidaDiaria / numAnimales) < kilosPorAnimal) {
			suficiente = false;
			kilosPorAnimal = comidaDiaria / numAnimales;
			System.out.println("Disponemos de alimento suficiente: " + suficiente);
			System.out.println("Racion que le corresponde a cada animal: " + kilosPorAnimal);
		}else {
			suficiente = true;
			System.out.println("Disponemos de alimento suficiente: " + suficiente);
		}
	
	}
}
