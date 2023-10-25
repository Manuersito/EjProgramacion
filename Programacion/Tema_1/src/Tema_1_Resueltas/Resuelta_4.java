package Tema_1_Resueltas;

import java.time.LocalDate;
import java.util.Scanner;

public class Resuelta_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ano actual");
		int anoActual = sc.nextInt();
		System.out.println("ano nacimiento");
		int anoNacimiento = sc.nextInt();
		
		int anos = anoActual-anoNacimiento;
		
		System.out.println("tiene "+anos+" anos");
		
		
	}
}
