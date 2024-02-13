package r11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista l=new Lista();
		l.insertarPos("hola", 0);
		l.insertarUltimaPos("que");
		l.insertarUltimaPos("tal");
		l.insertarUltimaPos("estas");
		l.insertarUltimaPos("pablo");
		
		l.ordenar();
		System.out.println(l.toString());
		
		l.ordenar(new ComparaCaracteres());
		
		System.out.println(l.toString());
		
	}

}
