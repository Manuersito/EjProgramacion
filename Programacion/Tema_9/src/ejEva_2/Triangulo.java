package ejEva_2;

public class Triangulo extends FiguraGeometrica {

	double base, altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		
	}

	

	

	public Triangulo(String color, double base, double altura) {
		super(color);
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
		double area =(getBase()*getAltura())/2 ;
		return area;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura +", Area="
				+ calcularArea() + ", color=" + color + "]";
	}
	
	
}
