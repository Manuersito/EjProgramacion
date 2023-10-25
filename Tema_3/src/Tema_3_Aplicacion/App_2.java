package Tema_3_Aplicacion;

import java.util.Scanner;


public class App_2 {
    public static void main(String[] args) {
        int binario,decimal=0,base=1, unidadBinaria;

        System.out.print("Introduce un numero binario:");
        binario=new Scanner(System.in).nextInt();
        
       while (binario!=0) {
        unidadBinaria=binario%2;
        binario/=10;
        decimal += base*unidadBinaria;
        base *=2;
       }
    System.out.println(decimal);

       

        
    }
}
