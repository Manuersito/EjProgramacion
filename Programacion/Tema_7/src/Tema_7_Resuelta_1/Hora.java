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
public void inc() {
    // Incrementa la hora +1 minuto
    minutos++;
    if (minutos > 59) {
        // Comprobamos si los minutos sobrepasan 59
        minutos = 0; // Reiniciamos los minutos a 0
        hora++; // E incrementamos la hora
        if (hora > 23) {
            // Si la hora es mayor a 23 (algo que no tiene sentido)
            hora = 0; // Reiniciamos la hora a 0
        }
    }
}

public boolean setMinutos(int minutos) {
    boolean correcto = false;
    if (0 <= minutos && minutos < 60) {
        // Solo modificamos si el valor está en 0..59
        this.minutos = minutos;
        correcto = true;
    }
    return correcto;
}

public boolean setHora(int hora) {
    boolean correcto = false;
    if (0 <= hora && hora < 24) {
        // Solo modificamos si el valor está en 0..23
        this.hora = hora;
        correcto = true;
    }
    return correcto;
}

@Override
// Indica que estamos sustituyendo (overriding) el método
public String toString() {
    return hora + ":" + minutos;
}
}





