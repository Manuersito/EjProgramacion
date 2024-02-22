package ejEva_2;

public abstract class FiguraGeometrica implements Imprimible{
	static int NumFG = 0;
	String color;

	public FiguraGeometrica(String color) {
		
		this.color = color;
	}

	public FiguraGeometrica() {
		this.color = "verde";
	}

	abstract double calcularArea();

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public void imprimir() {
		System.out.println(toString());
	}

}
