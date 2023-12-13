package Tema_5_Propuestas_Profesora;

public class Recursiva_6 {

	    public static void imprimirVector(int[] vector, int index) {
	        if (index < vector.length) {
	        	System.out.print(vector[index] + " ");
	            imprimirVector(vector, index + 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] miVector = {1, 2, 3, 4, 5};
	        imprimirVector(miVector, 0);
	    }
	}


