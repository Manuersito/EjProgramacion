package Tema_5_6_Propuestas_Profesora;

public class Recursiva_9 {
	 public static int calcularMaximo(int[] vector, int index) {
	        if (index == vector.length - 1) {
	            return vector[index];
	        } else {
	            int maxResto = calcularMaximo(vector, index + 1);
	            return Math.max(vector[index], maxResto);
	        }
	    }

	    public static int calcularMinimo(int[] vector, int index) {
	        if (index == vector.length - 1) {
	            return vector[index];
	        } else {
	            int minResto = calcularMinimo(vector, index + 1);
	            return Math.min(vector[index], minResto);
	        }
	    }

	    public static void main(String[] args) {
	        int[] miVector = {3, 1, 4, 2, 5};
	        System.out.println("Máximo: " + calcularMaximo(miVector, 0));
	        System.out.println("Mínimo: " + calcularMinimo(miVector, 0));
	    }
}
