package Tema_2_Aplicacion;

import java.util.*;

public class App_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, decena, unidad;
		System.out.println("Introduce un numero: ");
		n = sc.nextInt();
		if (n >= 1 && n <= 99) {
			decena = n / 10;
			unidad = n % 10;

			if (n >= 10 && n <= 20) {
				switch (n) {
				case 10:
					System.out.println("diez");
					break;
				case 11:
					System.out.println("once");
					break;
				case 12:
					System.out.println("doce");
					break;
				case 13:
					System.out.println("trece");
					break;
				case 14:
					System.out.println("catorce");
					break;
				case 15:
					System.out.println("quince");
					break;
				case 16:
					System.out.println("dieciseis");
					break;
				case 17:
					System.out.println("diecisiete");
					break;
				case 18:
					System.out.println("dieciocho");
					break;
				case 19:
					System.out.println("diecinueve");
					break;
				case 20:
					System.out.println("veinte");
					break;
				}
			} else {

				switch (decena) {

				case 2:
					System.out.print("veinti");
					break;
				case 3:
					if (unidad == 0) {
						System.out.println("treinta");
					} else {
						System.out.print("treinta y ");
					}

					break;
				case 4:
					if (unidad == 0) {
						System.out.println("cuarenta");
					} else {
						System.out.print("cuarenta y ");
					}

					break;
				case 5:
					if (unidad == 0) {
						System.out.println("cincuenta");
					} else {
						System.out.print("cincuenta y ");
					}

					break;
				case 6:
					if (unidad == 0) {
						System.out.println("sesenta");
					} else {
						System.out.print("sesenta y ");
					}

					break;
				case 7:
					if (unidad == 0) {
						System.out.println("setenta");
					} else {
						System.out.print("setenta y ");
					}

					break;
				case 8:
					if (unidad == 0) {
						System.out.println("ochenta");
					} else {
						System.out.print("ochenta y ");
					}

					break;
				case 9:
					if (unidad == 0) {
						System.out.println("noventa");
					} else {
						System.out.print("noventa y ");
					}

					break;
				}

				switch (unidad) {
				case 1:
					System.out.println("uno");
					break;
				case 2:
					System.out.println("dos");
					break;
				case 3:
					System.out.println("tres");
					break;
				case 4:
					System.out.println("cuatro");
					break;
				case 5:
					System.out.println("cinco");
					break;
				case 6:
					System.out.println("seis");
					break;
				case 7:
					System.out.println("siete");
					break;
				case 8:
					System.out.println("ocho");
					break;
				case 9:
					System.out.println("nueve");
					break;
				}
			}
		} else {
			System.out.println("introduce un numero correcto");
		}

	}
}
