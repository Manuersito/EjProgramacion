package Tema_2_Aplicacion;

import java.util.Scanner;

public class App_6 {
    public static void main(String[] args) {
        int numero;
        Scanner sc=new Scanner(System.in);
        System.out.println("escriba un numero: ");
        numero=sc.nextInt();
        numero = numero<0 ? -numero : numero;
        System.out.println("Su numero absoluto es: "+numero);
    }
}
