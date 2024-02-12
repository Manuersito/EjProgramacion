package Tema_7_Aplicacion_11;

public class Marcapaginas {
	
	    private String tituloLibro;
	    private String autorLibro;
	    private int totalPaginas;
	    private int paginaActual;



		public Marcapaginas(String tituloLibro, String autorLibro, int totalPaginas) {
	        this.tituloLibro = tituloLibro;
	        this.autorLibro = autorLibro;
	        this.totalPaginas = totalPaginas;
	        this.paginaActual = 0;
	    }

	    public void incrementarPagina(int paginasAAvanzar) {
	        if (paginaActual + paginasAAvanzar <= totalPaginas) {
	            paginaActual += paginasAAvanzar;
	            System.out.println("Se ha avanzado a la página " + paginaActual + ".");
	        } else {
	            System.out.println("¡Ya has llegado al final del libro!");
	        }
	    }

	    public String obtenerInformacionPaginaActual() {
	        return "Información de la página " + paginaActual + ": Título: " + tituloLibro + ", Autor: " + autorLibro;
	    }

	    public void reiniciarLectura() {
	        paginaActual = 0;
	        System.out.println("Se ha reiniciado la lectura desde el principio.");
	    }

}
