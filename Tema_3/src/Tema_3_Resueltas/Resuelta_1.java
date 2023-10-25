package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean esPar, esPositivo;
    System.out.println("Introduzca un numero: ");
    int num =sc.nextInt();
    while (num != 0) {
        esPar= num % 2 == 0 ? true : false;
        esPositivo = num >= 0 ? true : false;
        System.out.println("Es par?: "+esPar+ "\nEs positivo?: "+esPositivo);
        System.out.println("cuadrado: "+ num*num);
        System.out.println("Introduzca otro numero: ");
        num=sc.nextInt();
    }   
    }
}
