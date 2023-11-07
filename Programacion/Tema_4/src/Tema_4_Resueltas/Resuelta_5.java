package Tema_4_Resueltas;

public class Resuelta_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("es i vocal? "+esvocal('i'));
		System.out.println("es A vocal? "+esvocal('A'));
		System.out.println("es f vocal? "+esvocal('f'));
	}

	public static boolean esvocal(char c) {
		if (c == 'a' || c == 'A' || c == 'e' || c == 'E' ||c == 'i' || c == 'I' ||c == 'o' || c == 'O' ||c == 'u' || c == 'U') {
			return true;
		} else {

			return false;
		}
		
	}
	
}
