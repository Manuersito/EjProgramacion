package Tema_5_Propuestas;

import java.util.*;

public class Menu_tablas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op, nElemento = 0;
		int[] vector = new int[10];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=1;
		}
		
		
		
		
		do {
			menu();
			op = opcion();

			switch (op) {
			case 1:
				menuInsertar(vector,nElemento);
				opcion();

				break;
			case 2:
				menuEliminar();
				opcion();
				break;

			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;

			default:
				break;
			}
			
		} while (op!=7);
		
	}

	public static int opcion() {
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		return op;
	}

	public static void menu() {

		System.out.println(
				"Elige opcion: \n 1.Insertar \n 2.Eliminar \n 3.Modificar \n 4.Listar \n 5.Ordenar \n 6.Buscar \n 7.Salir");

	}

	
	
	
	
	
	public static void menuInsertar(int vector[],int nElemento) {
		int op;

		System.out.println(
				"Elige opcion: \n 1.Insertar por principio \n 2.Insertar por final \n 3.Insertar en lugar concreto \n 4.Salir");

		op = opcion();

		switch (op) {
		case 1:
			insertarP(vector, nElemento);
			break;
		case 2:

			break;
		case 3:

			break;

		default:
			break;
		}
	

	}

	
	
	
	
	public static void menuEliminar() {
		int op;

		System.out.println(
				"Elige opcion: \n 1.Eliminar por principio \n 2.Eliminar por final \n 3.Eliminar en lugar concreto \n 4.Salir");

		op = opcion();
		
		switch (op) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;

		default:
			break;
		}

	}
	
	
	
	
	
	
	private static int insertarP(int [] vector, int nElemento) {
		
		int num;
		
		if (nElemento==vector.length-1) {
			System.out.println("Error");
		} else {
			System.out.println("Que numero quieres meter");
			num=opcion();
			int [] auxiliar = new int [vector.length+1];
			auxiliar[0]=num;
			 
			for (int i = 0; i < vector.length; i++) {
			    auxiliar[i+1] = vector[i];
			}
			 
			vector = auxiliar;
			nElemento++;
			for (int i = 0; i < vector.length; i++) {
				System.out.print(vector[i]+", ");
				
			}
		}
		
		
		return nElemento;
	
		
	}

	
	
	
	
	
	
	
	
	

}
