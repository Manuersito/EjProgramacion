package Tema_2_Aplicacion;

import java.util.Scanner;

public class App_5 {
    public static void main(String[] args) {
    int base, altura, area;
    Scanner sc=new Scanner(System.in);
        System.out.println("Escriba la base: ");
        base=sc.nextInt();
        System.out.println("Escriba la altura: ");
        altura=sc.nextInt();

        if (base<0) {
            System.out.println("el numero no puede ser negativo");
        } else {
            if (altura<0) {
                System.out.println("el numero no puede ser negativo");
            }else{

                area=(base*altura)/2;
           
                    System.out.println("el area es: "+area);
                }
            }
            
    }
}
