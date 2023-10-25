package Tema_2_Aplicacion;

import java.util.Scanner;

public class App_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,suma,resta,multiplicacion,division,respuesta,operacion;
	    Scanner sc=new Scanner(System.in);
	    operacion = (int) (Math.random()*4+1);
	    n1=(int) (Math.random()*99+1);
	    n2=(int) (Math.random()*99+1);
	    switch (operacion) {
		case 1:
			System.out.println("La suma es "+n1+"+"+n2);
		    System.out.println("Escriba su respuesta");
		    respuesta = sc.nextInt();
		    suma=n1+n2;
		    if (respuesta==suma) {
		        System.out.println("Es correcto");
		    } else 
		            System.out.println("No es correcto, la respuesta correcta es: "+suma);
			break;
		case 2:
			System.out.println("La resta es "+n1+"-"+n2);
		    System.out.println("Escriba su respuesta");
		    respuesta = sc.nextInt();
		    resta=n1-n2;
		    if (respuesta==resta) {
		        System.out.println("Es correcto");
		    } else 
		            System.out.println("No es correcto, la respuesta correcta es: "+resta);
			break;
		case 3:
			System.out.println("La multiplicacion es "+n1+"*"+n2);
		    System.out.println("Escriba su respuesta");
		    respuesta = sc.nextInt();
		    multiplicacion=n1*n2;
		    if (respuesta==multiplicacion) {
		        System.out.println("Es correcto");
		    } else 
		            System.out.println("No es correcto, la respuesta correcta es: "+multiplicacion);
			break;
		case 4:
			System.out.println("La division es "+n1+"/"+n2);
		    System.out.println("Escriba su respuesta");
		    respuesta = sc.nextInt();
		    division=n1/n2;
		    if (respuesta==division) {
		        System.out.println("Es correcto");
		    } else 
		            System.out.println("No es correcto, la respuesta correcta es: "+division);
			break;
			
		    }

		}
	    
	    }

	


