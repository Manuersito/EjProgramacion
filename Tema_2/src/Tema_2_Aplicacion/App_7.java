package Tema_2_Aplicacion;

import java.util.Scanner;

public class App_7 {
public static void main(String[] args) {
    int n1,n2,suma,respuesta;
    Scanner sc=new Scanner(System.in);
    n1=(int) (Math.random()*99+1);
    n2=(int) (Math.random()*99+1);
    System.out.println("La suma es "+n1+"+"+n2);
    System.out.println("Escriba su respuesta");
    respuesta = sc.nextInt();
    suma=n1+n2;
    if (respuesta==suma) {
        System.out.println("Es correcto");
    } else {
        if (respuesta!=suma) {
            System.out.println("No es correcto");
        } else {
            
        }
    }
}
    
}