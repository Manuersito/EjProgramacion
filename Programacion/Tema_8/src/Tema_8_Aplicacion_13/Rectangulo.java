package Tema_8_Aplicacion_13;

import Tema_8_Aplicacion_12.Poligono;

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
