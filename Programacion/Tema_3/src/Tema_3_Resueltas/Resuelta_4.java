package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_4 {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		
		int etiqueta = 0, etiquetaArbolMasAlto, altura, alturaArbolMasAlto;
		
		System.out.println("Altura del arbol " + etiqueta + ": ");
		altura = sc.nextInt();
		
		alturaArbolMasAlto = altura;
		etiquetaArbolMasAlto = etiqueta;
		while(altura != -1) {
			if(altura > alturaArbolMasAlto) {
				alturaArbolMasAlto = altura;
				etiquetaArbolMasAlto = etiqueta;
			}
			etiqueta++;
			System.out.println("Altura del arbol " + etiqueta + ": ");
			altura = sc.nextInt();
		}
		if(alturaArbolMasAlto == -1) {
			System.out.println("No hay ningun arbol");
		}else {
			System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
			System.out.println("Etiqueta del arbol: " + etiquetaArbolMasAlto);
		}
	}

}
