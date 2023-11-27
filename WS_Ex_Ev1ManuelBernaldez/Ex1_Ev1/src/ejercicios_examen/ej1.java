package ejercicios_examen;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0 ,j=0,k=0,cuantos;
		System.out.println("cuantos numeros quieres mostrar?");
		cuantos=sc.nextInt();
		for (int i = 0; i < cuantos; i++) {
			
			n=n+k;
			k=j;
			j=n;
			
			System.out.print(n+", ");
			if (i==0) {
				n++;
			}
		}
	}

}
