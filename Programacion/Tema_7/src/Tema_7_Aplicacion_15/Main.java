package Tema_7_Aplicacion_15;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendario calendario = new Calendario(1, 3, 2023);
		calendario.incrementarDia();
		calendario.mostrar();
		System.out.println(calendario.compararFechas(2, 3, 2023));
	}

}
