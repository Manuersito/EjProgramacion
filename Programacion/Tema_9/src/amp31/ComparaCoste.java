package amp31;

import java.util.Comparator;

public class ComparaCoste implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Llamada l1=(Llamada) o1;
		Llamada l2=(Llamada) o2;
		return (int)(l1.coste()-l2.coste());//IMP EL CASTING A INT
	}

	
}
