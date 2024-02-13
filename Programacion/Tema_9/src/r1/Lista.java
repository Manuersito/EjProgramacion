package r1;

import java.util.Arrays;

public class Lista implements Cola,Pila,ColaDoble {
	 Integer[] lista;
		
		public Lista() {
			lista=new Integer[0];
		}
		
		public int numeroElementos() {
			return lista.length;
		}
		
		@Override
		public String toString() {
			return "Lista" +Arrays.toString(lista)+"";
		}
		
		void insertarPrimeraPos(Integer elemento) {
			lista=Arrays.copyOf(lista, lista.length+1);
			System.arraycopy(lista, 0, lista, 1, lista.length-1);
			lista[0]=elemento;
		}
		void insertarUltimaPos(Integer elemento) {
			lista=Arrays.copyOf(lista, lista.length+1);
			lista[lista.length-1]=elemento;
		}
		void insertarPos(Integer elemento,int pos) {
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
		
		
		Integer eliminarPos(int pos) {
			System.arraycopy(lista, pos+1, lista, pos, lista.length-pos-1);
			lista=Arrays.copyOf(lista, lista.length-1);
			return lista[pos];
		}
		
		void busquedaElemento(int num) {
			boolean encontrado=false;
			for(int i=0;i<lista.length && encontrado==false;i++) {
				if(num==lista[i]) {
					System.out.println("Posicion "+i);
					encontrado=true;
				}else {
					System.out.println("-1");
				}
			}
		}

		@Override
		public void encolar(Integer n) {
			// TODO Auto-generated method stub
			//insercion por el final
			insertarUltimaPos(n);//metodo de Lista
		}

		@Override
		public Integer desencolar() {
			// TODO Auto-generated method stub
			//eliminacion por el principio
			return eliminarPos(0);
		}

		@Override
		public void apilar(Integer n) {
			// TODO Auto-generated method stub
			//insertar por el final
			insertarUltimaPos(n);
		}

		@Override
		public Integer desapilar() {
			// TODO Auto-generated method stub
			//eliminar por el final
			return eliminarPos(lista.length-1);
		}

		@Override
		public void encolarPrincipio(Integer n) {
			// TODO Auto-generated method stub
			insertarUltimaPos(n);
		}

		@Override
		public void desencolarFinal() {
			// TODO Auto-generated method stub
			//eliminar por el final
			eliminarPos(lista.length-1);
		}
		
	
}

