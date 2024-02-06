package app13;

import app12.Poligono;

public class Rectangulo extends Poligono{

public Rectangulo(double base, double altura) {
		super(base, altura);
		// TODO Auto-generated constructor stub
	}
double area;
	@Override
	public double Area() {
		area=base*altura;
		return area;
	}

	
	@Override
	public String toString() {
		return "Rectangulo [area=" + area + "]";
	}
}
