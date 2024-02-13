package r11;

import java.util.Comparator;

public class ComparaCaracteres implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String cad1=(String) o1;
		String cad2=(String) o2;
		return cad1.compareTo(cad2);
	}

	
}
