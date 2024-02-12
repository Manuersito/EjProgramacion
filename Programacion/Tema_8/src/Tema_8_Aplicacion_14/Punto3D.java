package Tema_8_Aplicacion_14;

import java.math.MathContext;

public class Punto3D extends Punto {
	Integer z;
	double distancia;

	public Punto3D(Integer x, Integer y, Integer z) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.z = z;
	}

	double distancia(Punto3D otroPunto3d) {
		double equis, i, seta;
		equis = Math.pow(otroPunto3d.x - x, 2);
		i = Math.pow(otroPunto3d.y - y, 2);
		seta = Math.pow(otroPunto3d.z - z, 2);
		distancia = Math.sqrt(equis + i + seta);

		return distancia;
	}

	void info() {
		System.out.println("La distancia que hay es de: " + distancia);
		
	}
}


