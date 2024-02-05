package Tema_7_Aplicacion_2;

import java.util.Scanner;

public class Caja {
int ancho,alto,fondo;
Unidad unidad;
String etiqueta;
public Caja(int ancho, int alto, int fondo, Unidad unidad) {
	this.ancho = ancho;
	this.alto = alto;
	this.fondo = fondo;
	this.unidad = unidad;
	this.etiqueta = etiqueta;
}
public Caja() {
	
}

double getVolumen() {
	double resultado;
	resultado= ancho*alto*fondo;
	return resultado;
	
}

void setEtiqueta(String etiqueta){
	
}
@Override
public String toString() {
	return "Etiqueta=" + etiqueta + ",Volumen=" + getVolumen() + "m³]";
}



}
