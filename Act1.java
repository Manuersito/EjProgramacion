package Act1;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int cont = 0, pares = 0;
		
		pares(t, cont, pares);

	}
	
	static void pares(int[] t, int cont, int pares) {
		if(cont == 9) {
			if(t[cont] % 2 == 0) {
				pares++;
			}
			
			System.out.println("La cantidad de pares es: " + pares);

			
		}else {
			if(t[cont] % 2 == 0) {
				pares++;
			}
			
			pares(t, cont + 1, pares);
		}
	}

}
