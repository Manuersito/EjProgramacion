package Tema_7_Aplicacion_7;



public class PrincipalApp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaApp7 c = new ColaApp7();
		for (int i = 0; i < 5; i++) {
			c.encolar(i);
		}
		System.out.println(c);

		for (int i = 0; i < 2; i++) {
			c.desencolar();
		}
		System.out.println(c);
	}

}
