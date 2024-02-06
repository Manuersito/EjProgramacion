package Tema_7_Resuelta_8;

import java.util.Arrays;

public abstract class Instrumento {
	protected Notas[] melodia; 
	public Instrumento () { 
		melodia = new Notas[0]; 
		}  
	void add(Notas n) { 
		melodia = Arrays.copyOf(melodia, melodia.length + 1);
		melodia[melodia.length - 1] = n; 
		} 
	
	abstract void interpretar ();
}
