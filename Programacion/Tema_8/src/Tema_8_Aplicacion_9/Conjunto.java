package Tema_8_Aplicacion_9;

import Tema_8_Aplicacion_4.Lista;

public class Conjunto extends Lista{


	public Conjunto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override

	public void insertarFinal(Integer nuevo) {
		if (super.buscar(nuevo)<0) {
			super.insertarFinal(nuevo);
		}else {
			System.out.println("El numero ya esta en el conjunto");
		}
		
	}
	
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
