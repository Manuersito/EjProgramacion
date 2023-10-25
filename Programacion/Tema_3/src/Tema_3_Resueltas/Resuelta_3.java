package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int numSecreto = (int) (Math.random()*100+1);
        System.out.println("Introduzca numero del 1 al 100: ");
        num = sc.nextInt();
        while (numSecreto != num && num !=-1) {
            if (numSecreto<num) {
                System.out.println("Menor");
            } else {
                System.out.println("Mayor");
            }
            System.out.println("Introduzca otro numero: ");
            num = sc.nextInt();
        }
        if (numSecreto==num) {
            System.out.println("Enhorabuena...");
        } else {
            System.out.println("Otra vez sera...");
        }
    }
}
