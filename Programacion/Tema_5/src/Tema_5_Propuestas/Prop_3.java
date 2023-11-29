package Tema_5_Propuestas;

import java.util.*;

public class Prop_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int positivo = 0,negativo=0,contadorcero = 0,contadorpos = 0,contadorneg = 0,mediapos,medianeg;
		
		System.out.println("De que tamaño quieres el array");
		n = sc.nextInt();
		int []v=new int[n];
		
		for (int i=0;i<v.length;i++) {
			System.out.println("Introduce un valor: ");
			v[i]=sc.nextInt();
		}
		System.out.println("El array es: "+"\n"+Arrays.toString(v));

		for (int i : v) {
			if (i>0) {
				
				positivo+=i;
				contadorpos++;
			} else {
				if (i==0) {
					contadorcero++;
				}else {
				
				negativo+=i;
				contadorneg++;
				}
			}
			
		}
		mediapos=positivo/contadorpos;
		medianeg=negativo/contadorneg;
		
		System.out.println("El array es: "+"\n"+Arrays.toString(v));
		System.out.println("\n"+"La media de positivos es: "+mediapos+"\n"+"La media de negativos es: "+medianeg+"\n"+"La cantidad de ceros es: "+contadorcero);
		
	}

}
