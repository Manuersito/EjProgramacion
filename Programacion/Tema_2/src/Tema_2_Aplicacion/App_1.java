package Tema_2_Aplicacion;

import java.util.*;

public class App_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, c, d, u, m;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un numero entre 0 y 9999: ");
		num = sc.nextInt();
		
		u = ((num % 1000) % 100) % 10;
		d = ((num % 1000) % 100) / 10;
		c = (num % 1000) / 100;
		m = (num / 1000);
		if ((m == u) && (c == d)) {
			System.out.println("El numero es capicua");
		}else 
			if((c == u) && m==0) {
			System.out.println("El numero es capicua");
		}else 
			if((d == u) && c==0 && m==0){
			System.out.println("El numero es capicua");
		}else {
			System.out.println("El numero no es capicua");
		}
	}

}
