package Tema_8_Aplicacion_8;



public class PrincipalApp8 {
	public static void main(String[] args) {
		ColaDoble cd = new ColaDoble();
		for (int i = 0; i < 5; i++) {
			cd.encolar(i);
		}
		System.out.println(cd);
		
			cd.insertarPrincipio(9);
		
		System.out.println(cd);
		for (int i = 0; i < 2; i++) {
			cd.desenpilar();
		}
		System.out.println(cd);
	}
	}

