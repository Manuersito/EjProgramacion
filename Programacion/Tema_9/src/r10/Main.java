package r10;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		Integer[] conjNum = new Integer[20];
		for (Integer i = 0; i < conjNum.length; i++) {
			conjNum[i] = (int) (Math.random() * (100 - 1) + 1);
		}

		
		Arrays.sort(conjNum, new ComparaNumeros());

		System.out.println(Arrays.toString(conjNum));
	}

}


