package Tema_4_Aplicacion;

import java.util.Scanner;

public class App_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		double x1,x2,y1,y2;
		System.out.println("dime primer punto");
		x1=sc.nextDouble();
		System.out.println("dime segundo punto");
		x2=sc.nextDouble();
		System.out.println("dime tercer punto");
		y1=sc.nextDouble();
		System.out.println("dime cuarto punto");
		y2=sc.nextDouble();

		
		
		System.out.println("la distancia es: "+distanciaeuclidea(x1,x2,y1,y2));
	}

	public static double distanciaeuclidea(double x1,double x2,double y1,double y2) {
		double distanciaeuclidea;
		
		distanciaeuclidea=Math.sqrt((Math.pow(x1-x2, 2))+(Math.pow(y1-y2,2)));
		
		return (distanciaeuclidea);
		
	}
}
