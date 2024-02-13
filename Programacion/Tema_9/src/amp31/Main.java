package amp31;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Llamada l1=new Llamada(95494, 6789,0, true, "29-03-2023 12:56:34","29-03-2023 13:30:00");
		Llamada l2=new Llamada(45784, 2136,1, true, "30-03-2023 21:35:34","30-03-2023 23:20:00");
		Llamada l3=new Llamada(23456, 1234,2, true, "29-01-2023 13:36:34","29-01-2023 13:41:00");
		Llamada l4=new Llamada(19765, 9877,3, false, "02-05-2023 12:56:34","02-05-2023 14:30:00");
		Llamada l5=new Llamada(24677, 5677,4, true, "31-12-2023 23:56:34","01-01-2024 00:02:00");
		
		Lista l=new Lista();
		l.insertarUltimaPos(l1);
		l.insertarUltimaPos(l2);
		l.insertarUltimaPos(l3);
		l.insertarUltimaPos(l4);
		l.insertarUltimaPos(l5);
		
	
		
		
		
		//ordenamos y mostramos
		
		l.ordenar();
		System.out.println(l.toString());
		
		//ordenamos por coste y mostramos
		l.ordenar(new ComparaCoste());
		System.out.println(l.toString());
		
	}

}
