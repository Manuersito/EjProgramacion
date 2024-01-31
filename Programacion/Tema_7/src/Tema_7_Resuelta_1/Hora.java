package Tema_7_Resuelta_1;

public class Hora {
protected int hora , minutos; 
Hora (int hora, int minutos){
	this.hora=0;
	this.minutos=0;
	
	if (!setHora(hora)) {
		System.out.println("La hora es incorrecta");
	}
	
	if (!setMinutos(minutos)) {
		System.out.println("Los minutos son incorrectos");
	}
}

public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMinutos() {
	return minutos;
}
public void setMinutos(int minutos) {
	this.minutos = minutos;
}
}


