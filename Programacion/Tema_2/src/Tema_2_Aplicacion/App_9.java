package Tema_2_Aplicacion;

import java.util.Scanner;

public class App_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el ángulo en grados: ");
		double anguloGrados = scanner.nextDouble();

		double anguloNormalizado = anguloGrados % 360;

		double anguloRadianes = anguloNormalizado * Math.PI / 180.0;

		System.out.println("El ángulo " + anguloGrados + " grados es equivalente a " + anguloRadianes + " radianes.");

	}

}
