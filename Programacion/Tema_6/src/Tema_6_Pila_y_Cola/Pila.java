package Tema_6_Pila_y_Cola;

import java.util.Arrays;
public class Pila {

		Integer[] tabla = new Integer[0];

		public void enpilar(int x) {
			tabla = Arrays.copyOf(tabla, tabla.length + 1);
			tabla[tabla.length - 1] = x;
		}
		
		public void desenpilar() {
			tabla=Arrays.copyOf(tabla, tabla.length - 1);
		}
		
		public void mostrar() {
			System.out.println(Arrays.toString(tabla));
		}

}
