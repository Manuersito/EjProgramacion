package Tema_5_6_Resueltas;
import java.util.*;
public class Resuelta_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] v=new int[5];
		for (int i = 0; i < v.length; i++) {
			v[i]=(int)(Math.random()*10+1);
		}
		
		
		int max=v[0];
		
		for (int i : v) {
			if (i>max) {
				max=i;
			}
			
		}
		System.out.println(Arrays.toString(v));
		System.out.println("el maximo es: "+max);
	}

}
