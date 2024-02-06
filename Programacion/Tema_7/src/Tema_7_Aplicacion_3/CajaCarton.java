package app3;

import app2.Caja;
import app2.Unidad;

public class CajaCarton extends Caja{

	public double area;

	public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
		super(ancho, alto, fondo, unidad);
		this.area = 2* (ancho*alto*fondo);
		// TODO Auto-generated constructor stub
	}
	double getArea() {
		return area;
	}
	@Override
	public double getVolumen() {
		// TODO Auto-generated method stub
		return super.getVolumen()*0.8;
	}
	
	
	
}
