package App;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class prop_eva_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] v=new String[0];
		
		//leer primer archivo
		try (BufferedReader in = new BufferedReader(new FileReader("nums_1.txt"))){
			int cont1=0;
			String line = in.readLine();	
			boolean b;
			while (line!=null) {
				
				if (busqueda(v, line)==false) {
					v = Arrays.copyOf(v, v.length+1);
					v[v.length-1]=line;
				}
			line = in.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
		//leer segundo archivo
		try (BufferedReader in = new BufferedReader(new FileReader("nums_2.txt"))){
			int cont1=0;
			String line = in.readLine();	
			boolean b;
			while (line!=null) {
				
				if (busqueda(v, line)==false) {
					v = Arrays.copyOf(v, v.length+1);
					v[v.length-1]=line;
				}
			line = in.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try (BufferedWriter out = new BufferedWriter(new FileWriter("nums_3.txt"))){
			for (int i = 0; i < v.length; i++) {
				out.write(v[i]);
				out.newLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println(Arrays.toString(v));
		
	}
	

	
	static boolean busqueda(String [] v, String line){
		boolean b= false;
		for (int i = 0; i < v.length && !b; i++) {
			if (v[i].equals(line)) {
				b= true;
			}
		}
		
		return b;
		
	}

}
