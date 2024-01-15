package pack;

import java.util.Arrays;

public class ej2 {

	public static void main(String[] args) {
		int[] vector1 = { 1, 4, 6, 8 };
		int[] vector2 = { 2, 3, 5, 7 };

		int[] vector3 = combinarVectores(vector1, vector2);

		for (int elemento : vector3) {
			System.out.print(elemento + " ");
		}
	}

	
	public static int[] combinarVectores(int[] vector1, int[] vector2) {
		

		
		if (vector1.length == 0) {
			return new int[0];
		}

		
		int[] restoCombinado = combinarVectores(Arrays.copyOfRange(vector1, 1, vector1.length),
				Arrays.copyOfRange(vector2, 1, vector2.length));

		
		int[] vector3 = new int[restoCombinado.length + 1];
		vector3[0] = vector1[0] + vector2[0];

		
		for (int i = 0; i < restoCombinado.length; i++) {
			if (i % 2 == 0) {
				vector3[i + 1] = vector1[i + 1] - vector2[i + 1];
			} else {
				vector3[i + 1] = vector1[i + 1] + vector2[i + 1];
			}
		}

		return vector3;
	}

}
