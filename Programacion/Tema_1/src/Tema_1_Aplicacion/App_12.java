package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        double metros, cm;
        double cmTruncados;
        System.out.println("Introduzca longitud en metros: ");
        metros=sc.nextDouble();
        cm=metros*100;
        cmTruncados=Math.ceil(cm);
        System.out.println("La longitud en centimetros es: "+cmTruncados);
	}

}
