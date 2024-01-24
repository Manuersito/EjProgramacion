package Tema_6_Aplicacion_12;

public class Ecuacion2Grado {
	int a, b, c;
	public Ecuacion2Grado (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void resultado1() {
		int resultado = (int) ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a *c)) / (2* a));
		System.out.println(resultado);
	}
	public void resultado2() {
		int resultado = (int) (-b - Math.sqrt(Math.pow(b, 2) - 4 * a *c)) / (2* a);
		System.out.println(resultado);
	}
}
