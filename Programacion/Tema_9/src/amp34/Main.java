package amp34;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carta c1=new Carta("palos",12);
		Carta c2=new Carta("oro",1);
		Carta c3=new Carta("copas",3);
		
		Baraja b=new Baraja();
		
		Carta c4=b.azar();//MUY IMP-->IGUALO UN NUEVO OBJETO CARTA AL METODO DE BARAJA QUE CREA UNA CARTA AL AZAR
		
		b.addCarta(c1);
		b.addCarta(c2);
		b.addCarta(c3);
		b.addCarta(c4);
		
		//ordenamos por palo y numero
		b.ordenar();
		System.out.println(b.toString());
		
		
		//ordenamos por numero
		b.ordenar(new ComparaNumero());
		System.out.println(b.toString());
		
		
	}

}
