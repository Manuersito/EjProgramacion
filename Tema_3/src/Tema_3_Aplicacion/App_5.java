package Tema_3_Aplicacion;

import java.util.Scanner;

public class App_5 {
public static void main(String[] args) {
	 int nF, nC=1, M, N, NM;
     System.out.println("Inserte numero de filas: ");
     nF = new Scanner(System.in).nextInt();
     for (int i = 0; i < nF; i++) {
         for (int j = nF; j < i; j--) {
             
         }
         int valor=1;
     for(int j=0;j<=i; j++) {
     System.out.print(valor+" ");
     valor=valor*(i-j)/(j+1);
     }
     System.out.println("");
}
}
}
