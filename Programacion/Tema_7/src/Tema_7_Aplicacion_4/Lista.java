package Tema_7_Aplicacion_4;

import java.util.Arrays;

public class Lista {
	public Integer[] tabla;
	
	//Constructor cero
	public Lista() {
		// TODO Auto-generated constructor stub
		tabla = new Integer[0];
	}
	//Obtener nÃºmero de elementos de la lista
	public int numElementos () {
		return tabla.length;
	}
	//Insertar elemento al final
	public void insertarFinal(Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		tabla[tabla.length - 1] = nuevo;
	}
	//Insertar lista al final
	public void insertarFinal(Lista nuevo) {
		int tamIni = tabla.length;
		tabla = Arrays.copyOf(tabla, tabla.length + nuevo.tabla.length);
		System.arraycopy(nuevo.tabla, 0, tabla, tamIni, nuevo.tabla.length);
	}
	//Insertar principio
	public void insertarPrincipio(Integer nuevo) {
		tabla = Arrays.copyOf(tabla, tabla.length + 1);
		System.arraycopy(tabla, 0, tabla, 1, tabla.length -1);
		tabla[0] = nuevo;
	}
	//Insertar con indice
	public void insertar(Integer indice, Integer nuevo) {
		if (indice >= 0 && indice <= tabla.length -1) {
			tabla = Arrays.copyOf(tabla, tabla.length + 1);
			System.arraycopy(tabla, indice, tabla, indice + 1, tabla.length - indice - 1);
			tabla[indice] = nuevo;
		}
	}
	//Eliminar elemento
	public Integer eliminar(int indice) {
		Integer eliminado = null;
		if (indice >= 0 && indice < tabla.length) {
			eliminado = tabla[indice];
			for (int i = indice + 1; i < tabla.length; i++) {
				tabla[i - 1] = tabla[i];
			}
			tabla = Arrays.copyOf(tabla, tabla.length -1);
		}
		return eliminado;
	}
	//Obtener elemento
	public Integer getElemento (int indice) {
		Integer elemento = -1;
		if (indice >= 0 && indice <= tabla.length - 1) {
			elemento = tabla[indice];
		}
		return elemento;
	}
	//Buscar
	public int buscar(Integer elemento) {
		int indice = -1;
		for (int i = 0; i < tabla.length; i++) {
			if (elemento == tabla[i]) {
				indice = i;
			}
		}
		return indice;
	}
	//Metodo estatico concatena
	public static Lista concatena(Lista l1, Lista l2) {
		Lista l3 = new Lista();
		l3.insertarFinal(l1);
		l3.insertarFinal(l2);
		return l3;
	}
	@Override
	public String toString() {
		return "Lista [tabla=" + Arrays.toString(tabla) + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(tabla);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || this != obj)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lista other = (Lista) obj;
		return Arrays.equals(tabla, other.tabla);
	}
	
	public void desenpilar() {
		tabla = Arrays.copyOf(tabla, tabla.length - 1);
	}
	
}