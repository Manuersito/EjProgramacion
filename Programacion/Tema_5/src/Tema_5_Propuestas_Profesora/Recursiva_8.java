package Tema_5_Propuestas_Profesora;

public class Recursiva_8 {
	public static int sumaVector(int[] vector, int index) {
        if (index < vector.length) {
            return vector[index] + sumaVector(vector, index + 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] miVector = {1, 2, 3, 4, 5};
        System.out.println("Suma: " + sumaVector(miVector, 0));
    }
}
