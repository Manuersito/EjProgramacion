package app6;

import java.util.Arrays;

import app4.Lista;

public class PilaApp6 extends Lista {

	
	
	public PilaApp6() {
		super();
		// TODO Auto-generated constructor stub
	}

	// TODO Auto-generated constructor stub
	public void enpilar(int x) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = x;
	}

	

	@Override
	public String toString() {
		return "PilaApp6 [tabla=" + Arrays.toString(tabla) + "]";
	}
	
}
