package Tema_6_Pila_y_Cola;

import java.util.Arrays;

public class Cola {
	Integer[] tabla = new Integer[0];

	public void encolar(int x) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = x;
	}
	
	public void desencolar() {
		tabla=Arrays.copyOfRange(tabla, 1, tabla.length);
	}
	
	public void mostrar() {
		System.out.println(Arrays.toString(tabla));
	}
}
