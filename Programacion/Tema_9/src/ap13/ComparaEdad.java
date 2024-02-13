package ap13;

import java.util.Comparator;

public class ComparaEdad implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Futbolista f1=(Futbolista) o1;
		Futbolista f2=(Futbolista) o2;
		if(f1.edad-f2.edad==0) {
			return f1.nombre.compareTo(f2.nombre);
		}else {
			return f1.edad-f2.edad;
		}
		
	}

}
