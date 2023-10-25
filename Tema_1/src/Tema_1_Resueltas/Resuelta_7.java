package Tema_1_Resueltas;

import java.util.Scanner;

public class Resuelta_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radio, longitud, area;
		System.out.println("Escriba el radio: ");
		radio = sc.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		System.out.println("La longitud es: "+longitud);
		
		area = Math.PI * (radio*radio);
		System.out.println("El area del circulo es: "+area);
	}

}
