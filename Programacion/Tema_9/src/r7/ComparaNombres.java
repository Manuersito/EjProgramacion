package r7;
import java.util.Comparator;
public class ComparaNombres implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		Socio socio1=(Socio) ob1;
		Socio socio2=(Socio) ob2;
		return (socio1.nombre).compareTo(socio2.nombre);//para ver si es mayor
	}

	
	
}
