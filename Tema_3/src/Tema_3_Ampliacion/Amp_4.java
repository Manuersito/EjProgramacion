package Tema_3_Ampliacion;

public class Amp_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=71263;
		int par = 0,impar = 0;
		
		while (num>0) {
			if (num%2==0) {
				par++;
			} else {
				impar++;
			}
			num=num/10;
		}
		
		System.out.println("hay "+par+" pares y "+impar+" impares");
	}

}
