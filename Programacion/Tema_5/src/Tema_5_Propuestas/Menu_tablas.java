package Tema_5_Propuestas;

import java.util.*;

public class Menu_tablas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println(
					"Elige opcion: \n 1.Insertar \n 2.Eliminar \n 3.Modificar \n 4.Listar \n 5.Ordenar \n 6.Buscar \n 7.Salir");
			op = sc.nextInt();

		} while (op < 7);
		switch (op) {
		case 1:
			do {
System.out.println("Elige opcion: \n 1.Insertar por principio \n 2.Insertar por final \n 3.Insertar en lugar concreto \n 4.Salir");
op =sc.nextInt();
			} while (op< 4);
			break;
		case 2:

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
	}

}
