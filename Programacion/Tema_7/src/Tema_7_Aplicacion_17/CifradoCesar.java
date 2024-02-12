package Tema_7_Aplicacion_17;

public class CifradoCesar {
	public static String cifrar(String frase, int num) {
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String fraseCodificada = "";
		frase.toLowerCase();
		char c;
		for (int i = 0; i < frase.length(); i++) {
			
			c = frase.charAt(i);
			
			int posPrimera = abecedario.indexOf(c);
			
			
			if (posPrimera > -1 && posPrimera + num < abecedario.length()) {
				
				c = abecedario.charAt(posPrimera + num);
				
			} else if (posPrimera > -1 && num + posPrimera >= abecedario.length()) {
				
				int posTotal = abecedario.length() - posPrimera;
				
				posTotal = num - posTotal;
				
				c = abecedario.charAt(posTotal);
				
			}
			
			fraseCodificada = fraseCodificada + c;
		}
		
		return fraseCodificada;
	}
}
