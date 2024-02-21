package ejEva_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometrica t = new Circulo(5, "Rojo");
		FiguraGeometrica h = new Rectangulo(5, 10.5, "Amarillo");
		FiguraGeometrica i = new Triangulo(5, 10.5, "Azul");		

		t.imprimir();
		System.out.println(h.toString());
		System.out.println(i.toString());

	}

}
