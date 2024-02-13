package ap11;

import java.util.Arrays;


/**
 * Clase lista 
 * <b>Implementa las clases Cola y Pila</b>
 * @author Pablo Rodriguez
 *
 */
public class Lista implements Cola,Pila{
	 String[] lista;
		
		public Lista() {
			lista=new String[0];
		}
		
		public int numeroElementos() {
			return lista.length;
		}
		
		@Override
		public String toString() {
			return "Lista" +Arrays.toString(lista)+"";
		}
		
		void insertarPrimeraPos(String elemento) {
			lista=Arrays.copyOf(lista, lista.length+1);
			System.arraycopy(lista, 0, lista, 1, lista.length-1);
			lista[0]=elemento;
		}
		void insertarUltimaPos(String elemento) {
			lista=Arrays.copyOf(lista, lista.length+1);
			lista[lista.length-1]=elemento;
		}
		void insertarPos(String elemento,int pos) {
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
		
		
		String eliminarPos(int pos) {
			System.arraycopy(lista, pos+1, lista, pos, lista.length-pos-1);
			lista=Arrays.copyOf(lista, lista.length-1);
			return lista[pos];
		}
		
		void busquedaElemento(String buscado) {
			boolean encontrado=false;
			for(int i=0;i<lista.length && encontrado==false;i++) {
				if(buscado.compareTo(lista[i])==0) {
					System.out.println("Posicion "+i);
					encontrado=true;
				}else {
					System.out.println("-1");
				}
			}
		}

		@Override
		public void encolar(String nuevo) {
			// TODO Auto-generated method stub
			insertarUltimaPos(nuevo);
		}

		@Override
		public String desencolar() {
			// TODO Auto-generated method stub
			return eliminarPos(0);
		}

		@Override
		public void apilar(String nuevo) {
			// TODO Auto-generated method stub
			insertarUltimaPos(nuevo);
		}

		@Override
		public String desapilar() {
			// TODO Auto-generated method stub
			return eliminarPos(lista.length-1);
		}
}
