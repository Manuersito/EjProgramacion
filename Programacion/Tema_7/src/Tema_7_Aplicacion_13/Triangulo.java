package app13;

import app12.Poligono;

public class Triangulo extends Poligono {
	

	double area;


	public Triangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double Area() {
	area = (base*altura)/2;
		return area;
	}
	
	@Override
	public String toString() {
		return "Triangulo [area=" + area + "]";
	}

	
	
}
