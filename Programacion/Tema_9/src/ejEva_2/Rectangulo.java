package ejEva_2;

public class Rectangulo extends FiguraGeometrica {
	double base, altura;

	public Rectangulo( String color,double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
		
	}
	

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
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
		double area = getBase() * getAltura();
		return area;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", Area=" + calcularArea()
				+ ", Color=" + getColor() + "]";
	}

}
