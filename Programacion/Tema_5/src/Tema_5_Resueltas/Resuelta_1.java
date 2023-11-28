package Tema_5_Resueltas;

import java.nio.file.spi.FileSystemProvider;

public class Resuelta_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[10];
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			v[i]=(int) (Math.random()*100+1);
		}
		
		for (int i : v) {
			suma+=i;
		}
		for (int i : v) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("El total de la suma es: "+suma);
	}

}
