package Tema_1_Aplicacion;

import java.util.Scanner;

public class App_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double cm;
        double m;
        double mm;
        double mcm;
        double mmcm;
        double suma;
        System.out.println("Introduzca una longitud en centrimetros: ");
        cm = sc.nextDouble();
        System.out.println("Introduzca una longitud en milimetros: ");
        mm = sc.nextDouble();
        System.out.println("Introduzca una logitud en metros: ");
        m = sc.nextDouble();
        mcm = m*100;
        mmcm = mm/10;
        suma = cm+mmcm+mcm;
        System.out.println("La longitud total en centimetros es: "+suma);
	}

}
