package Tema_7_Aplicacion_13;

import java.util.Arrays;

public class Colores {
	private String[] colores = { "rojo", "amarillo", "azul" };

	private boolean existeElemento(String nuevo, String[] cad) {
		boolean resultado = false;
		nuevo = nuevo.toLowerCase();
		if (Arrays.asList(cad).contains(nuevo)) {
			resultado = true;
		}
		return resultado;
	}

	boolean repetido(String[] tabla, String num) {
		boolean resultado = false;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == num) {
				resultado = true;
			}
		}
		return resultado;
	}

	public void insertarColor(String nuevo) {
		nuevo = nuevo.toLowerCase();
		if (!existeElemento(nuevo, colores)) {
			colores = Arrays.copyOf(colores, colores.length + 1);
			colores[colores.length - 1] = nuevo;
		} else {
			System.out.println("Ese color " + nuevo + " ya está.");
		}
	}

	public void getAzar(int n) {
		if (n >= 0 && n <= colores.length) {
			String[] aleatorios = new String[n];
			for (int i = 0; i < aleatorios.length; i++) {
				int numAleatorio = (int) (Math.random() * colores.length);
				while (repetido(aleatorios, colores[numAleatorio])) {
					numAleatorio = (int) (Math.random() * colores.length);
				}
				aleatorios[i] = colores[numAleatorio];
			}
			System.out.println(Arrays.toString(aleatorios));
		} else {
			System.out.println("No hay tantos colores");
		}

	}

	public void getColores() {
		System.out.println(Arrays.toString(colores));
	}
}
