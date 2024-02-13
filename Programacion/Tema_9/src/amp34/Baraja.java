package amp34;

import java.util.Arrays;
import java.util.Comparator;

public class Baraja {

	Carta[]baraja;
	
	final static String[]palos= {"oro","copas","espadas","bastos"};
	
	//el maximo numero por palo son 12 cartas

	public Baraja() {
		super();
		this.baraja = new Carta[0];
	}

	@Override
	public String toString() {
		return "Baraja [baraja=" + Arrays.toString(baraja) + "]";
	}
	
	 public void addCarta(Carta c) {
		baraja=Arrays.copyOf(baraja, baraja.length+1);
		baraja[baraja.length-1]=c;
	}
	 
	 static public Carta azar() {
		String palo=palos[(int)(Math.random()*(3-0)+0)];	 
		Integer numero=(int)(Math.random()*(12-1)+1);
		Carta c=new Carta(palo,numero);
		return c;
	 }
	 
	 public void ordenar() {
		 Arrays.sort(baraja);
	 }
	 
	 public void ordenar(Comparator c) {
		 Arrays.sort(baraja,c);
	 }
}
