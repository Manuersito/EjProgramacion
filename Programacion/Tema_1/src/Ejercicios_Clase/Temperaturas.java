package Ejercicios_Clase;

import java.util.Scanner;

public class Temperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

	int temp1,temp2,temp3,temp4;
	double media;
	
	System.out.println("Escribra temperatura 1");
	temp1=sc.nextInt();
	
	System.out.println("Escribra temperatura 2");
	temp2=sc.nextInt();
	
	System.out.println("Escribra temperatura 3");
	temp3=sc.nextInt();
	
	System.out.println("Escribra temperatura 4");
	temp4=sc.nextInt();
	
	System.out.println(media(temp1, temp2, temp3, temp4));
	}
public static double media(int temp1, int temp2, int temp3, int temp4) {
	double media = (double)(temp1 + temp2 + temp3 + temp4)/4;
	
	return media;
}
}
