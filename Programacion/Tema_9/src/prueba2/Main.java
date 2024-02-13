package prueba2;

import java.util.Arrays;

public class Main implements Funcion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]tabla= {3.5,2.7,35.7,49};
		
		Main m=new Main();//al igual q otras clases, creamos un objeto main
		//Funcion f se refiere a la instancia de una clase, y no a una funciomn en concreto
		//como funcionTabla devuelve un array double,la igualamos a tabla para modificarla
		tabla=funcionTabla(tabla,m);
		System.out.println(Arrays.toString(tabla));
		
	}

	static double[]funcionTabla(double[]t,Funcion f){
		for(int i=0;i<t.length;i++) {
			t[i]=f.aplicar(t[i]);//MUY IMP
		}
		return t;
	}

	@Override
	public double aplicar(double n) {
		// TODO Auto-generated method stub
		return Math.sqrt(n);
	}
	
	
}
