package app14;

public class Punto {
	Integer x, y;
	double distancia;

	public Punto(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

	double distancia(Punto otroPunto) {
		double equis, i;
		equis = Math.pow(otroPunto.x - x, 2);
		i = Math.pow(otroPunto.y - y, 2);
		distancia = Math.sqrt(equis + i);
		return distancia;
	}

		void info() {
			System.out.println("La distancia que hay es de: " + distancia);
}
}
