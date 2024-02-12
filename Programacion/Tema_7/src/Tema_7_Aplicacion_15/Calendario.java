package Tema_7_Aplicacion_15;

public class Calendario {
	private int ano;
	private int mes;
	private int dia;

	public Calendario(int dia, int mes, int ano) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
	}

	boolean mes30() {
		int[] meses30 = { 4, 6, 9, 11 };
		boolean resutl = false;
		for (int i = 0; i < meses30.length; i++) {
			if (mes == meses30[i]) {
				resutl = true;
			}
		}
		return resutl;
	}

	boolean mes31() {
		int[] meses31 = { 1, 3, 5, 7, 10, 12 };
		boolean resutl = false;
		for (int i = 0; i < meses31.length; i++) {
			if (mes == meses31[i]) {
				resutl = true;
			}
		}
		return resutl;
	}

	public void incrementarDia() {
		if (dia == 30 && mes30()) {
			dia = 1;
			incrementarMes();
		} else if (dia == 31 && mes31()) {
			dia = 1;
			incrementarMes();
		} else if (dia == 28 && mes == 2) {
			dia = 1;
			incrementarMes();
		} else {
			dia++;
		}
	}

	public void incrementarMes() {
		if (mes == 12) {
			mes = 1;
			incrementarAnho();
		} else {
			mes++;
		}
	}

	public void incrementarAnho() {
		if (ano == -1) {
			ano = 1;
		} else {
			ano++;
		}
	}

	boolean compararFechas(int otroDia, int otroMes, int otroAno) {
		boolean resutl = false;
		if (dia == otroDia && otroMes == mes && ano == otroAno) {
			resutl = true;
		}
		return resutl;
	}

	public void mostrar() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}
