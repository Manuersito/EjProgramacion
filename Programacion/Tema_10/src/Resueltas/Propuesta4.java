package Resueltas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Propuesta4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String texto ="";
		try (BufferedWriter out = new BufferedWriter(new FileWriter("prop4.txt"))){
			String cad = "";

			while (!cad.equalsIgnoreCase("fin")) {
				out.newLine();
				System.out.println("Escribe una linea: ");
				cad=sc.nextLine();
				out.write(cad);
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try (BufferedReader in = new BufferedReader(new FileReader("prop4.txt"))) {
			String linea = in.readLine();  
            while (linea != null) {  
                texto = texto + linea + '\n'; 
                linea = in.readLine(); }
		} catch (IOException e) {
			System.out.println(e.getMessage());
			
			
		}
		
		System.out.println(texto);
	}
	
	}
	
	
	


