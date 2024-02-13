package ap13;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Futbolista[]equipo=new Futbolista[5];
		
		Futbolista f1=new Futbolista("123","Pablo",25,7);
		Futbolista f2=new Futbolista("456","Andres",25,20);
		Futbolista f3=new Futbolista("789","Dani",32,5);
		Futbolista f4=new Futbolista("321","Fran",29,12);
		Futbolista f5=new Futbolista("654","Manu",36,15);
		
		equipo[0]=f1;
		equipo[1]=f2;
		equipo[2]=f3;
		equipo[3]=f4;
		equipo[4]=f5;
		
		System.out.println("Los dni de "+f1.nombre+" y "+f2.nombre+" son iguales:"+f1.equals(f2));
		
		//ordenar por el dni
		Arrays.sort(equipo);
		System.out.println(Arrays.toString(equipo));
		
		//ordenar por el nombre
		Arrays.sort(equipo,new ComparaNombre());
		System.out.println(Arrays.toString(equipo));
		
		//ordenar por la edad
		Arrays.sort(equipo,new ComparaEdad());
		System.out.println(Arrays.toString(equipo));
	}

}
