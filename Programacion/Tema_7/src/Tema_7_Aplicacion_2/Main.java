package Tema_7_Aplicacion_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caja c = new Caja(5,10,15,Unidad.cm);
		
		c.getVolumen();
		c.setEtiqueta("Esto es una prueba");
		System.out.println(c.toString());
	}

}
