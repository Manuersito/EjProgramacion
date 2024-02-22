package ejEva_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometrica t = new Circulo( "Rojo",5);
		FiguraGeometrica r = new Circulo(5);
		FiguraGeometrica h = new Rectangulo("Amarillo",5, 10.5);
		FiguraGeometrica z = new Rectangulo(5, 10.5);
		FiguraGeometrica i = new Triangulo("Azul",5, 10.5);	
		FiguraGeometrica n = new Triangulo(5, 10.5);		


		
		t.imprimir();
		r.imprimir();
		h.imprimir();
		z.imprimir();
		i.imprimir();
		n.imprimir();

	}

}
