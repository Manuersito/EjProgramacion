package Tema_5_6_Aplicacion;

import java.util.Arrays;

public class App_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] v = {2, 8, 4, 0, 3, 1, 5, 7, 6, 9};
int n=8;
int [] res=buscartodos(v,n);
System.out.println(Arrays.toString(res));

	}

	public static int[] buscartodos(int[] v, int n) {
		int[] result=new int[0];
		int i=0;
		while(i<v.length) {
			if (n==v[i]) {
				result=Arrays.copyOf(result, result.length+1);
				result[result.length-1]=i;
			}
			i++;
		}
		
		
		
		return result;
		
	}
	
}
