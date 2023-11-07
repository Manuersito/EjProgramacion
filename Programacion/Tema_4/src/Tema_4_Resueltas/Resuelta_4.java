package Tema_4_Resueltas;

import java.util.*;
public class Resuelta_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer numero: ");
		int a = sc.nextInt();
		System.out.println("Escribe el segundo numero: ");
		int b = sc.nextInt();
		
		maximo(a,b);
		
	}
public static void maximo(int a,int b) {
	int maximo;
	if (a>b) {
		maximo=a;
	} else {
		maximo=b;
	}
	System.out.println("el maximo de "+a+" y "+b+" es: "+maximo);
}
}
