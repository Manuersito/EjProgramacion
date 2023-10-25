package Tema_3_Resueltas;

import java.util.Scanner;

public class Resuelta_2 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sumaEdades = 0;
    int contadorAlumnos = 0;
    int contadorMayorEdad = 0;
    double media;
    System.out.println("Introduzca una edad: ");
    int edad =sc.nextInt();    
    while (edad >= 0) {
        sumaEdades += edad;
        contadorAlumnos++;
        if (edad >= 18) {
            contadorMayorEdad++;
        }
        System.out.println("introduzca edad: ");
        edad = sc.nextInt();
    }
    media = (double) sumaEdades/contadorAlumnos;
    System.out.println("suma de todas las edades: "+sumaEdades);
    System.out.println("media: "+media);
    System.out.println("numero total de alumnos: "+contadorAlumnos);
    System.out.println("Mayores de edad: "+contadorMayorEdad);
    }
}
