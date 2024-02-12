package Tema_8_Aplicacion_14;

public class PrincipalApp14 {
	public static void main(String[] args) {
	
		Punto o = new Punto(2, 3);
		Punto p = new Punto(6, 9);
		Punto3D r = new Punto3D(9, 8, 7);
		Punto3D t = new Punto3D(4, 5, 6);

		o.distancia(p);
		o.info();
		System.out.println(" ");
		r.distancia(t);
		r.info();
		
	}

}

