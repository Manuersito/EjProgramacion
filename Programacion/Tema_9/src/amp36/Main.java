package amp36;

import java.util.Arrays;

public class Main implements Funcion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]tabla= {20.5,34.5,21.5,49};
		
		
		
		Funcion f=new Funcion() {//lo implementamos asi
			
			@Override
			public double aplicar(double n) {
				// TODO Auto-generated method stub
				return (double)Math.sqrt(n);
			}
		};
		System.out.println(Arrays.toString(funcionTabla(tabla, f)));
		
	}

	static double[]funcionTabla(double[] t,Funcion f){//Funcion f=aplicar()
		for(int i=0;i<t.length;i++) {
			t[i]=f.aplicar(t[i]);//IMP-->REPASAR
		}
		return t;
	}

	@Override
	public double aplicar(double n) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
