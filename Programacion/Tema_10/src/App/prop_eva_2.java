package App;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class prop_eva_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] minusculas = new  char[0];
		char [] mayusculas = new  char[0];
		
		try (FileReader in = new FileReader("caracteres.txt")){
			int c = in.read();
			
			while (c!=-1) {
				if (Character.isLowerCase(c)) {
					minusculas = Arrays.copyOf(minusculas, minusculas.length+1);
					minusculas[minusculas.length-1]=(char)c;
					
				} else if (Character.isUpperCase(c)) {
					mayusculas = Arrays.copyOf(mayusculas, mayusculas.length+1);
					mayusculas[mayusculas.length-1]=(char)c;
				
				}
				c= in.read();
			}
			
			System.out.println(Arrays.toString(minusculas));
			System.out.println(Arrays.toString(mayusculas));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		
		try (BufferedWriter out = new BufferedWriter(new FileWriter("minusculas.txt"))){
			for (int i = 0; i < minusculas.length; i++) {
				out.write(minusculas[i]);
				out.newLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	try (BufferedWriter out = new BufferedWriter(new FileWriter("mayusculas.txt"))){
		for (int i = 0; i < mayusculas.length; i++) {
			out.write(mayusculas[i]);
			out.newLine();
		}
	} catch (IOException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	

	
}
	}


