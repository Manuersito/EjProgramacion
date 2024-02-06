package app9;

import app4.Lista;

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
