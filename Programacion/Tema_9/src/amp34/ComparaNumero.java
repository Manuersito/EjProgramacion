package amp34;

import java.util.Comparator;

public class ComparaNumero implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Carta c1=(Carta) o1;
		Carta c2=(Carta) o2;
		return c1.numero-c2.numero;
	}

}
