package Tema_6_Aplicacion_11;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Marcapaginas libro = new Marcapaginas("La Sombra del Viento", "Carlos Ruiz Zafón", 500);

	        libro.incrementarPagina(50);
	        System.out.println(libro.obtenerInformacionPaginaActual());

	        libro.incrementarPagina(30);
	        System.out.println(libro.obtenerInformacionPaginaActual());

	        libro.reiniciarLectura();
	        System.out.println(libro.obtenerInformacionPaginaActual());
	    }
	}


