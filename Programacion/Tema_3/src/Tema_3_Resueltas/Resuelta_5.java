package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int res, n1, n2, numOperaciones=0;
		
		do {
			n1 = (int)(Math.random()*100+1);
			n2 = (int)(Math.random()*100+1);
			System.out.print(n1 + " + " + n2 + " = ");
			res = sc.nextInt();
			numOperaciones++;
		}while (res == n1 + n2); {
			System.out.println("A conseguido hacer: " + (numOperaciones - 1) + " sumas consecutivas");
		}
	}

}
