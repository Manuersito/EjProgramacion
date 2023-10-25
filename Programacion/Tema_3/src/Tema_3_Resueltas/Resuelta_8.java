package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int suma=0,n;
double media;
for (int i = 0; i < 10; i++) {
	System.out.println("Escribe un numero");
	n = sc.nextInt();
	suma += n;
	
}
media = suma/10;
System.out.println("La media es: "+media);
	}

}
