package Tema_6_Pila_y_Cola;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila p = new Pila();
		
		System.out.println(p.desapilar());
		for (int i = 0; i < args.length; i++) {
			p.apilar(i);
		}
		
		Integer num = p.desapilar();
		while (num!=null) {
			System.out.print(num + ' ');
			num = p.desapilar();
			}
		
		
	}

}
