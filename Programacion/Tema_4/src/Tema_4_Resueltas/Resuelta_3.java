package Tema_4_Resueltas;

import java.util.Scanner;

public class Resuelta_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio");
		int radio = sc.nextInt();
		System.out.println("Introduce la altura");
		int altura = sc.nextInt();
		
		areayvolumen(radio,altura);
		
	}
	public static void areayvolumen(int radio,int altura) {
		double volumen,area;
		
		volumen=Math.PI*Math.pow(radio, 2)*altura;
		System.out.println("El volumen es: "+volumen);
		
		area=2*Math.PI*radio*(altura+radio);
		System.out.println("El area es: "+area);
	}
}
