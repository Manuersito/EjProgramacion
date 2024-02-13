package r7;

import java.util.Comparator;

public class ComparaEdades implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		// TODO Auto-generated method stub
		return ((Socio)ob1).edad()-((Socio)(ob2)).edad();
	}
	
}
