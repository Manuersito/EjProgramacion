package pack;

public class ej3 {
public static void main(String[] args) {
	
	        String cad1 = "12345678";
	        String cad2 = "abcde";

	        String cad3 = combinarCadenas(cad1, cad2);

	        System.out.println(cad3);
	    }

	    public static String combinarCadenas(String cad1, String cad2) {
	        int longitudMinima = Math.min(cad1.length(), cad2.length());

	        String resultado = "";

	        
	        for (int i = 0; i < longitudMinima; i++) {
	            resultado += cad1.charAt(i) + "" + cad2.charAt(i);
	        }

	        if (cad1.length() > cad2.length()) {
	            resultado += cad1.substring(longitudMinima);
	        } else if (cad2.length() > cad1.length()) {
	            resultado += cad2.substring(longitudMinima);
	        }

	        return resultado;
	    
	

}
}