package Ejercicios_Clase;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
double n1,n2,resultado;
int opcion;


do {
	System.out.println("Escriba un numero entre 1 y 4: ");
	opcion=sc.nextInt();
	
} while (opcion<1||opcion>4);

switch (opcion) {
case 1:
	System.out.println("Escriba el numero 1");
	n1 = sc.nextDouble();
	System.out.println("Escriba el numero 2");
	n2 = sc.nextDouble();
	resultado=n1+n2;
	System.out.println("la suma entre "+n1+" y "+n2+" es: "+resultado);
	break;

case 2:
	System.out.println("Escriba el numero 1");
	n1 = sc.nextDouble();
	System.out.println("Escriba el numero 2");
	n2 = sc.nextDouble();
	resultado=n1-n2;
	System.out.println("la resta entre "+n1+" y "+n2+" es: "+resultado);
	break;
	
case 3:
	System.out.println("Escriba el numero 1");
	n1 = sc.nextDouble();
	System.out.println("Escriba el numero 2");
	n2 = sc.nextDouble();
	resultado=n1*n2;
	System.out.println("la multiplicacion entre "+n1+" y "+n2+" es: "+resultado);
	break;
	
case 4:
	System.out.println("Escriba el numero 1");
	n1 = sc.nextDouble();
	System.out.println("Escriba el numero 2");
	n2 = sc.nextDouble();
	resultado=n1/n2;
	System.out.println("la division entre "+n1+" y "+n2+" es: "+resultado);
	break;

default:
	break;
}
	}

}
