package Tema_7_Pila_y_Cola;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cola c = new Cola();
		for (int i = 0; i < 5; i++) {
			c.encolar(i);
		}
		c.mostrar();

		for (int i = 0; i < 2; i++) {
			c.desencolar();
		}
		c.mostrar();

		Pila p = new Pila();
		for (int i = 0; i < 5; i++) {
			p.enpilar(i);
		}
		p.mostrar();
		for (int i = 0; i < 2; i++) {
			p.desenpilar();
		}
		p.mostrar();
	}
}
