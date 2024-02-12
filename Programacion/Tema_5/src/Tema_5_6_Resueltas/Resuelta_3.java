package Tema_5_6_Resueltas;
import java.util.*;
public class Resuelta_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Cuantos numeros quieres introducir?");
		n=sc.nextInt();
		int[] v = new int[n];
		
		for (int i = v.length-1; i >= 0; i--) {
			System.out.println("Introduce numero");
			v[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(v));
		
		
	}

}
