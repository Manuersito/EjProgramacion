package Tema_7_Aplicacion_16;

public class MainApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(5, 5);
		Punto p2 = new Punto(10, 10);
		p1.distanciaUclidiana(p2);
		p1.desplazaXY(-3, +4);
		p1.distanciaUclidiana(p2);
	}

}
