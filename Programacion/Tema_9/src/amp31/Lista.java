package amp31;

import java.util.Arrays;
import java.util.Comparator;


public class Lista implements Cola,Pila{
	 Object[] lista;
		
		public Lista() {
			lista=new Object[0];
		}
		
		public int numeroElementos() {
			return lista.length;
		}
		
		@Override
		public String toString() {
			return "Lista" +Arrays.toString(lista)+"";
		}
		
		void insertarPrimeraPos(Object elemento) {
			lista=Arrays.copyOf(lista, lista.length+1);
			System.arraycopy(lista, 0, lista, 1, lista.length-1);
			lista[0]=elemento;
		}
		void insertarUltimaPos(Object elemento) {
			Llamada l=(Llamada) elemento;
			lista=Arrays.copyOf(lista, lista.length+1);
			lista[lista.length-1]=l;
		}
		void insertarPos(Object elemento,int pos) {
			String cad=(String) elemento;
			lista=Arrays.copyOf(lista, lista.length+1);
			System.arraycopy(lista, pos, lista, pos+1, lista.length-pos-1);//VER MUY IMP
			lista[pos]=elemento;
		}
		
		void insertarOtraLista(Lista otra) {//MUY IMP
			int tamaño=lista.length;
			lista=Arrays.copyOf(lista, lista.length+otra.lista.length);//IMP
			System.arraycopy(otra.lista, 0, lista, tamaño, otra.lista.length);
		}
		
		void obtenerElemento(int pos) {
			for(int i=0;i<lista.length;i++) {
				if(i==pos) {
					System.out.println(lista[i]);
				}
			}
		}
		
		
		Object eliminarPos(int pos) {
			System.arraycopy(lista, pos+1, lista, pos, lista.length-pos-1);
			lista=Arrays.copyOf(lista, lista.length-1);
			return lista[pos];
		}
		
		void busquedaElemento(Object buscado) {
			boolean encontrado=false;
			for(int i=0;i<lista.length && encontrado==false;i++) {
				if(buscado.equals(lista[i])) {//metodo equals normal-->PARA COMPARAR OBJETOS-->IMP
					System.out.println("Posicion "+i);
					encontrado=true;
				}else {
					System.out.println("-1");
				}
			}
		}

		@Override
		public void apilar(Object nuevo) {
			// TODO Auto-generated method stub
			insertarUltimaPos(nuevo);
		}

		@Override
		public Object desapilar() {
			// TODO Auto-generated method stub
			return eliminarPos(lista.length-1);
		}

		@Override
		public void encolar(Object nuevo) {
			// TODO Auto-generated method stub
			insertarUltimaPos(nuevo);
		}

		@Override
		public Object desencolar() {
			// TODO Auto-generated method stub
			return eliminarPos(0);
		}
		//APP24
		void ordenar() {
			Arrays.sort(lista);
		}
		
		void ordenar(Comparator c) {
			Arrays.sort(lista,c);
		}
	
}
