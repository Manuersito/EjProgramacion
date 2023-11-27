package Act5;

public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] t1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] t2 = {3, 6, 9 ,12, 11, 13, 15, 16, 17, 18};
		
		int[]t3 = mezclar(t1, t2);
		listado(t3);
	}
	
	static int[] mezclar(int[] t1, int[] t2){
		int[] t3 = new int[t1.length + t2.length];
		int nm = t3.length - 1;
		int m = 0;
		
		for (int i = 0; i < t1.length; i++) {
			if(t1[i] % 3 == 0) {
				t3[m] = t1[i];
				m++;
			}else {
				t3[nm] = t1[i];
				nm--;

			}
		}
		
		for (int i = 0; i < t2.length; i++) {
			if(t2[i] % 3 == 0) {
				t3[m] = t2[i];
				m++;
			}else {
				t3[nm] = t2[i];
				nm--;

			}
		}
		return t3;
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

}
