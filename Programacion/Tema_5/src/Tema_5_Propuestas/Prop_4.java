package Tema_5_Propuestas;

public class Prop_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a=new int[10];
int contpar = 0,contimpar = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i]=i;
			if (a[i]%2==0) {
				contpar++;					/*Manuel Bernaldez Carrasco*/
			} else {
				contimpar++;

			}
		
		}
		System.out.println("Hay "+contpar+" pares");
		System.out.println("Hay "+contimpar+" impares");
	}

}
