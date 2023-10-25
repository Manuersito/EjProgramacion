package Tema_3_Aplicacion;

import java.util.Scanner;

public class App_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado = new Scanner(System.in);

	        System.out.println("Escriba un numero: ");
	        int num = new Scanner(System.in).nextInt();
	        int binario = 0, numBin = 0, i = 0;
	        while (num != 0) {
	            int unidadBinaria = num % 2;
	            num /= 2;
	            numBin = numBin + unidadBinaria * (int) (Math.pow(10, i));
	            System.out.print(" "+unidadBinaria+" ");
	            i++;
	            System.out.println();
	            
	            
	        }
	        System.out.println("la conversion es: "+numBin);
	}

}
