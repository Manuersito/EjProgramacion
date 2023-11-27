package Act2;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, cont = 0;
		
		do {
			System.out.println("Introduce el numero a pasar a binario");
			n = sc.nextInt();
		}while(n < 0);
			
		 binario(n, cont);
		
		
	}
	
	static void binario(int n, int cont) {
		int res;
		if(n <= 1) {
			res = (int) (n % 2 * Math.pow(10, cont));
			System.out.print(res);

		}else {
			res = (int) (n % 2 * Math.pow(10, cont));
			binario(n / 2, cont + 1);
		}
	}

}
