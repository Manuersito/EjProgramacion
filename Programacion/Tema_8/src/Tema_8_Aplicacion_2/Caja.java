package Tema_8_Aplicacion_2;

public class Caja {
	int ancho, alto, fondo;
	Unidad unidad;
	String etiqueta;
	protected double volumen;

	public Caja(int ancho, int alto, int fondo, Unidad unidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.unidad = unidad;
		this.volumen = ancho * alto * fondo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getFondo() {
		return fondo;
	}

	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	
	
	public double getVolumen() {

		return volumen;

	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta=new String(etiqueta);
		
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", unidad=" + unidad + ", etiqueta="
				+ etiqueta + ", volumen=" + volumen +"]";
	}

	

}
