package amp35;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p=new Persona("123","Pablo",true,true);
		
		System.out.println(p.toString());
		
		
		System.out.println("Saldo:"+p.aumentarSaldo(1200));
		System.out.println("Numero de horas trabajadas:"+p.aumentarHoras(34));
	}

}
