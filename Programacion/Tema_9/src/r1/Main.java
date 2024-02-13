package r1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Lista l=new Lista();
		
		
		//COLA
		 System.out.print("Dime un numero a encolar:");
		 
		Integer n=teclado.nextInt();
			
		while(n>=0) {
			l.encolar(n);
			System.out.print("Dime un numero a encolar:");
			n=teclado.nextInt();
		}
		l.toString();
		System.out.println();
		n=l.desencolar();

		while(n!=null) {
			//imp la condicion para mostrar-->hasta que termine la lista
			System.out.print(n+",");
			n=l.desencolar();
		}
		 
		l.toString();
		
		//PILA
		System.out.print("Dime un numero a apilar:");
		 n=teclado.nextInt();
		while(n>=0) {
			l.apilar(n);
			System.out.print("Dime un numero a apilar:");
			n=teclado.nextInt();
		}
		l.toString();
		System.out.println();
		n=l.desapilar();

		while(n!=null) {
			//imp la condicion para mostrar-->hasta que termine la lista
			System.out.print(n+",");
			n=l.desapilar();
		}
		 
		l.toString();
		
		//COLADOBLE
		System.out.print("Dime un numero a encolar:");
		n=teclado.nextInt();
		while(n>=0) {
			l.encolarPrincipio(n);
			System.out.print("Dime un numero a encolar:");
			n=teclado.nextInt();
		}
		l.toString();
		System.out.println();
		l.encolarPrincipio(n);

		while(n!=null) {
			//imp la condicion para mostrar-->hasta que termine la lista
			System.out.print(n+",");
			l.desencolarFinal();
		}
		 
		l.toString();
		
		
		
	
	}

}
