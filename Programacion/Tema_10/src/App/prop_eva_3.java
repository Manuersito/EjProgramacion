package App;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class prop_eva_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] v = new String[0];

		try (BufferedReader in = new BufferedReader(new FileReader("Desordenado.txt"))) {
			String line = in.readLine();
			while (line != null) {
				v = Arrays.copyOf(v, v.length + 1);
				v[v.length - 1] = line;

				line = in.readLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		Arrays.sort(v);
		try (BufferedWriter out = new BufferedWriter(new FileWriter("Ordenado.txt"))){
			for (int i = 0; i < v.length; i++) {
				out.write(v[i]);
				out.newLine();
			}
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
