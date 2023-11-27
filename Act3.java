package Act3;

public class Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] t = new int[10];
		rellenar(t);
		listado(t);
		reverse(t);
		listado(t);
		
		

	}
	
	static void rellenar(int[] t) {
		for (int i = 0; i < t.length; i++) {
			t[i] = (int) (Math.random() * 33 + 5);
		}
	}
	
	static void listado(int[] t) {
		System.out.print("[");
		
		for (int i = 0; i < t.length; i++) {
			if(i < t.length - 1) {
				System.out.print(t[i] + ", ");
			}else {
				System.out.print(t[i] + "]");
			}
		}
		System.out.println();
	}
	
	static void reverse(int[] t) {
		int[] copia = new int[10];
		int cont = 0;
		
		for (int i = 0; i < t.length; i++) {
			copia[i] = t [i];
		}
		
		for (int i = t.length - 1; i >= 0; i--) {
			t[cont] = copia[i];
			cont++;
		}
	}

}
