package app3;

import app2.Caja;
import app2.Unidad;

public class PrincipalApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caja c2 = new Caja(3, 5, 3, Unidad.cm);
		c2.setEtiqueta("antonio");
		System.out.println(c2);
	}

}
