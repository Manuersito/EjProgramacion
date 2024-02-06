package app12;

public abstract class Poligono {
	
	protected double base,altura;
	
	
	public Poligono(double base, double altura) {
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

	public abstract double Area();
}
