package Tema_4_Aplicacion;

import java.util.Scanner;

public class App_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio");
		int radio = sc.nextInt();
		
		areayvolumen(radio);
	}
	public static void areayvolumen(int radio) {
		double volumen,superficie;
		
		volumen=(4*Math.PI)*(Math.pow(radio,3));
		System.out.println("El volumen es: "+volumen);
		
		superficie=(4*Math.PI)/3*(Math.pow(radio,3));
		System.out.println("La superficie es: "+superficie);
}
}
