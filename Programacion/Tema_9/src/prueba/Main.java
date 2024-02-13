package prueba;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p=new Persona("123","Pablo",true,true);
		
		p.aumentarHoras(120);
		p.aumentarSaldo(5000);
		
		System.out.println(p.toString());
		
		
	}

}
