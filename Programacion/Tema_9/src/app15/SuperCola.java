package app15;

import java.util.Arrays;

public class SuperCola {

	public int[]cola1;
	public int[]cola2;
	
	
	
	public SuperCola() {
		super();
		this.cola1 =new int[0];
		this.cola2 =new int[0];
	}




	public void encolarCola1(int n) {
		cola1=Arrays.copyOf(cola1, cola1.length+1);
		cola1[cola1.length-1]=n;
	}
	
	public void encolarCola2(int n) {
		cola2=Arrays.copyOf(cola2, cola2.length+1);
		cola2[cola2.length-1]=n;
	}
	
	
	public String desencolarCola1() {
		
		if(cola1.length==0 && cola2.length==0) {
			return null;
		}else if(cola1.length==0 && cola2.length>0){
			System.arraycopy(cola2, 1, cola2, 0, cola2.length-1);
			cola2=Arrays.copyOf(cola2, cola2.length-1);
			return "Desencolada";
		}else {
			System.arraycopy(cola1, 1, cola1, 0, cola1.length-1);
			cola1=Arrays.copyOf(cola1, cola1.length-1);
			return "Desencolada";
		}
		
		
	}
	
public String desencolarCola2() {
		
		if(cola1.length==0 && cola2.length==0) {
			return null;
		}else if(cola1.length>0 && cola2.length==0){
			System.arraycopy(cola1, 1, cola1, 0, cola1.length-1);
			cola1=Arrays.copyOf(cola1, cola1.length-1);
			return "Desencolada";
		}else {
			System.arraycopy(cola2, 1, cola2, 0, cola2.length-1);
			cola2=Arrays.copyOf(cola2, cola2.length-1);
			return "Desencolada";
		}
		
		
	}
	


@Override
public String toString() {
	return "SuperCola [Cola1=" + Arrays.toString(cola1)+", Cola2=" +Arrays.toString(cola2)+ "]";
}




}
