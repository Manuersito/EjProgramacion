package ejEva_2;

public class Triangulo extends FiguraGeometrica {

	double base, altura;

	public Triangulo(double base, double altura, String color) {
		super();
		this.base = base;
		this.altura = altura;
		this.color = color;
	}

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	@Override
	double calcularArea() {
		double area =(getBase()*getAltura())/2 ;
		return area;
	}
	
}
