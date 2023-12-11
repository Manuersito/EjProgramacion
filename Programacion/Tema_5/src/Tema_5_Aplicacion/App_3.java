package Tema_5_Aplicacion;

import java.util.Arrays;

public class App_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] v = {1,2,3,4,5,6,7};
		
		
	}
	public static int[] desordenar(int v[]) {
		int copia[]=Arrays.copyOf(v, v.length);
		for (int i : v) {
			int pos1 =(int)(Math.random()*v.length+1);
			int pos2 =(int)(Math.random()*v.length+1);
		}
		
		return v;
		
	}

}
