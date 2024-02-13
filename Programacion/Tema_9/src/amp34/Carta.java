package amp34;

public class Carta implements Comparable{

	String palo;
	Integer numero;
	public Carta(String palo, Integer numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Carta ["+ numero + " de "+ palo +"]\n";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Carta c=(Carta) o;
		if(palo.compareTo(c.palo)==0) {
			return numero-c.numero;
		}else {
			return palo.compareTo(c.palo);
		}
		
	}
	
	
}
