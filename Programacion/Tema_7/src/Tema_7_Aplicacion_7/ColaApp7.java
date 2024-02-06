package app7;

import java.util.Arrays;

import app4.Lista;

public class ColaApp7 extends Lista{
	
	
	

	public ColaApp7() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void encolar(int x) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = x;
	}
	
	public void desencolar() {
		tabla=Arrays.copyOfRange(tabla, 1, tabla.length);
	}

	public String toString() {
		return "ColaApp7 [tabla=" + Arrays.toString(tabla) + "]";
	}
	
}
