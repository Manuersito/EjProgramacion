package Tema_7_Aplicacion_14;

public class ImporteCambio {
	private double cambio;
	public ImporteCambio (double cambio) {
		this.cambio = cambio;
	}
	int[] cambioBillete(int parteEntera, int[] billetes) {
	    int[] numBilletes = new int[billetes.length];
	    for (int i = 0; i < billetes.length; i++) {
	        numBilletes[i] = (int) (parteEntera / billetes[i]);
	        parteEntera = parteEntera % billetes[i];
	    }
	    return numBilletes;
	}
	int calcularMonedas(int parteEntera) {
		int result = 0;
		result = parteEntera % 5;
		return result;
	}
	int[] cambioCentimos(int parteDecimal, int[] centimos) {
	    int[] numCentimos = new int[centimos.length];
	    for (int i = 0; i < centimos.length; i++) {
	        numCentimos[i] = (int) (parteDecimal / centimos[i]);
	        parteDecimal = parteDecimal % centimos[i];
	    }
	    return numCentimos;
	}
	public void calcularCambio() {
		int parteEntera = (int) Math.floor(cambio);
		double decimal = cambio - Math.floor(cambio);
		int parteDecimal = (int) (decimal * Math.pow(10, 2));
		int[] billetes = {500, 200, 100, 50, 20, 10, 5};
		int[] numBilletes = cambioBillete(parteEntera, billetes);
		for (int i = 0; i < billetes.length; i++) {
		    System.out.println(numBilletes[i] + " billetes de " + billetes[i] + " euros");
		}
		int monedas = calcularMonedas(parteEntera);
		switch (monedas) {
		case 0:
			System.out.println("0 Monedas");
			break;
		case 1:
			System.out.println("1 Moneda de 1 euro");
		case 2:
			System.out.println("1 Moneda de 2 euros");
		case 3:
			System.out.println("Una moneda de un euro y otra de 2 euros");
		case 4:
			System.out.println("Dos monedas de 2 euros");
		default:
			break;
		}
		int[] centimos = {50, 20, 10, 5, 2, 1};
		int[] numCentimos = cambioCentimos(parteDecimal, centimos);
		for (int i = 0; i < centimos.length; i++) {
			System.out.println(numCentimos[i] + " moneda de " + centimos[i] + " centimos");
		}
	}
}
