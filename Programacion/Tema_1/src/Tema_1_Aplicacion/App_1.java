package Tema_1_Aplicacion;

import java.util.*;

public class App_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double baseInponible, iva, total, ivaAPagar;

		System.out.println("introduce la base inponible: ");
		baseInponible = sc.nextDouble();

		System.out.println("Introduce el IVA");
		iva = sc.nextDouble();

		ivaAPagar = (baseInponible * iva) / 100;

		total = baseInponible + ivaAPagar;

		System.out.println("en total hay que pagar: " + total);
		System.out.println("el iva de " + baseInponible + " es: " + ivaAPagar);
	}

}
