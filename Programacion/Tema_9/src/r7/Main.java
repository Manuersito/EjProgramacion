package r7;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socio[]conjSocios=new Socio[4];
		
		Socio s1=new Socio(1,"Pablo","30-08-2002");
		Socio s2=new Socio(2,"Irene","29-08-2002");
		Socio s3=new Socio(3,"Marcos","09-08-2000");
		Socio s4=new Socio(4,"Paula","30-03-2008");
		
		/*System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("Edad de "+s1.nombre+":"+s1.edad());
		System.out.println("Edad de "+s2.nombre+":"+s2.edad());
		System.out.println(s1.compareTo(s2));*/
		
		Lista l=new Lista();
		l.insertarUltimaPos(s1);
		l.insertarUltimaPos(s2);
		l.insertarUltimaPos(s3);
		l.insertarUltimaPos(s4);
		
		/*ordenar el array segun la edad mediante la interfaz comparable DE SOCIO
		Arrays.sort(conjSocios);
		System.out.println(Arrays.toString(conjSocios));*/
		
		
		/*ComparaNombres
		
		Arrays.sort(conjSocios,new ComparaNombres());//IMP
		System.out.println(Arrays.toString(conjSocios));
		
		//ComparaEdades
		Arrays.sort(conjSocios,new ComparaEdades());
		System.out.println(Arrays.toString(conjSocios));
		
		//ComparaEdades al reves
		Arrays.sort(conjSocios,new ComparaEdades().reversed());
		System.out.println(Arrays.toString(conjSocios));*/
		
		
		//APP25
		//IMP-->DE FORMA NORMAL ME DA ERROR ,YA QUE NO PUEDO APLICAR LOS METODOS AL LA CLASE SOCIO(ES COMO SI QUISIESE
		//INTRODUCIR UN LISTADO A CLASE ALUMNO(NO TIENE SENTIDO YA QUE EL OBJETO ES 1 SOLO ALUMNO
		//ASI QUE HAY QUE CREAR UNA CLASE LISTASOCIOS(COMO CLASE Y ALUMNO)
		//PASAMOS LOS METODOS ALLI(SOLO LOS DE ORDENAR)-->EL COMPARABLE SE SIGUE MANTENIENDO EN SOCIO
		
		//APP27
		l.ordenar();
		System.out.println(l.toString());
		l.ordenar(new ComparaNombres());
		System.out.println(l.toString());
		
	}

}
