package Tema_5_6_Propuestas_Profesora;

public class Recursiva_7 {
	public static void imprimirInverso(int[] vector, int index) {
        if (index < vector.length) {
            imprimirInverso(vector, index + 1);
            System.out.print(vector[index] + " ");
        }
    }

    public static void main(String[] args) {
        int[] miVector = {1, 2, 3, 4, 5};
        imprimirInverso(miVector, 0);
    }
}
