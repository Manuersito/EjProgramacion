package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double base,altura,areaTriangulo;
		System.out.println("escribe la base del triangulo");
		base = sc.nextDouble();
		System.out.println("escribe la altura del triangulo");
		altura = sc.nextDouble();
		areaTriangulo = (base*altura)/2;
		System.out.println("el area del triagunlo es: "+areaTriangulo);
	}

}
