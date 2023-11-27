package ejercicios_examen;

import java.util.Iterator;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double base,exponente;
		System.out.println("Cual es la base?");
		base=sc.nextDouble();
		System.out.println("Cual es el exponente?");
		exponente=sc.nextDouble();
		double baseaux=base;
		
		for (int i = 1; i <= exponente; i++) {
			
			System.out.println(base+"^"+i+"="+baseaux);
			baseaux=baseaux*base;
		}
	}

}
