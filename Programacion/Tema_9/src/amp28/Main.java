package amp28;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jornada j1=new Jornada("123","12-06-2022 08:00:00","12-06-2022 14:30:00");
		Jornada j2=new Jornada("123","13-06-2022 09:40:00","13-06-2022 14:30:00");
		Jornada j3=new Jornada("123","14-06-2022 09:40:00","14-06-2022 15:25:00");
		Jornada j4=new Jornada("123","15-06-2022 10:00:00","15-06-2022 12:15:00");
		
		Lista l=new Lista();
		
		l.insertarUltimaPos(j1);
		l.insertarUltimaPos(j2);
		l.insertarUltimaPos(j3);
		l.insertarUltimaPos(j4);
		
		//ordenamos
		l.ordenar();
		System.out.println(l.toString());
		//ordenamos por minutos de la jornada
		l.ordenar(new ComparaMinutos());
		System.out.println(l.toString());
	}

}
