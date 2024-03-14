package App;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class App12 {

	public static void main(String[] args) {
		
		double peso,altura, mediaPeso, mediaAltura,edad, mediaEdad;
		int cont=0;
		FileInputStream in;
		try {
			in = new FileInputStream("deportistas.txt");
			Scanner sc = new Scanner(in);
			while (sc.hasNext()) {
				String nombre = sc.next();
				while (!sc.hasNextInt()) {
					
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
