package Tema_7_Aplicacion_16;

public class Punto {
	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void desplazaX(double dx) {
		x = x + dx;
	}

	public void desplazaY(double dy) {
		y = y + dy;
	}

	public void desplazaXY(double x, double y) {
		desplazaX(x);
		desplazaY(y);
	}

	public void distanciaUclidiana(Punto otro) {
		double result = Math.round(Math.sqrt(Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2)) * 10d / 10d);
		System.out.println(result);
	}
}
