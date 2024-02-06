package Tema_7_Aplicacion_6;

public class PrincipalApp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilaApp6 p = new PilaApp6();
		for (int i = 0; i < 5; i++) {
			p.enpilar(i);
		}
		System.out.println(p);
		for (int i = 0; i < 2; i++) {
			p.desenpilar();
		}
		System.out.println(p);
	}

}
