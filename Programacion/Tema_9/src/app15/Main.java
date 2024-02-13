package app15;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		
		int n;
		SuperCola s=new SuperCola();
		do {
			System.out.println("Dime una opcion:\n1.Encolar en cola1\n2.Encolar en cola2\n3.Desencolar de cola1\n4.Desencolar de cola2\n5.Salir");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.print("Dime un numero:");
				n=teclado.nextInt();
				s.encolarCola1(n);
				System.out.println(s.toString());
				break;
			case 2:
				System.out.print("Dime un numero:");
				n=teclado.nextInt();
				s.encolarCola2(n);
				System.out.println(s.toString());
				break;
			case 3:
				s.desencolarCola1();
				System.out.println(s.toString());
				break;
			case 4:
				s.desencolarCola2();
				System.out.println(s.toString());
				break;
			}
		}while(opcion!=5);
	}

}
