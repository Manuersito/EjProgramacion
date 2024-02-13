package ap11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista l=new Lista();
		
		l.insertarPrimeraPos("hola");
		l.insertarPos("como estas", 1);
		l.insertarUltimaPos("adios");
		l.insertarUltimaPos(".");
		l.eliminarPos(0);
		System.out.println(l.toString());
		
		
		
	}

}
