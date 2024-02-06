package Tema_7_Aplicacion_9;

public class PrincipalApp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conjunto cj = new Conjunto();
		Conjunto biggie = new Conjunto();
		
		
		cj.insertarFinal(1);
		cj.insertarFinal(2);
		cj.insertarFinal(3);
		cj.insertarFinal(4);
		
		
		biggie.insertarFinal(1);
		biggie.insertarFinal(2);
		biggie.insertarFinal(4);
		biggie.insertarFinal(3);
		
		
		
		System.out.println(cj.equals(biggie));
		
		
	}

}
