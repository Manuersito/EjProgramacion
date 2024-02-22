package ejEva_2;

public class Circulo extends FiguraGeometrica {
	int radio;

	public Circulo(int radio) {
		super();
		this.radio = radio;
		
	}
	

	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}


	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	double calcularArea() {

		double area;

		area = Math.PI * Math.pow(getRadio(), 2);
		return area;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", Area()=" + calcularArea()
				+ ", Color=" + getColor() + "]";
	}

}
