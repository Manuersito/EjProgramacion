package amp28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Jornada implements Comparable{

	String dni;
	LocalDateTime entrada;
	LocalDateTime salida;
	LocalDate fecha;
	public Jornada(String dni, String entrada, String salida) {//IMP LOS CONSTRUCTORES DE LAS FECHAS EN STRING
		super();
		this.dni = dni;
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		this.entrada = LocalDateTime.parse(entrada, formato);
		this.salida = LocalDateTime.parse(salida, formato);
	}
	
	@Override
	public String toString() {
		return "Jornada [dni=" + dni + ", fecha=" + fecha() + ", tiempo=" + tiempo() + " minutos]";
	}
	
	public LocalDate fecha() {//MUY IMP-->REPASAR
		return entrada.toLocalDate();
	}
	public int tiempo() {
		return (int) entrada.until(salida,ChronoUnit.MINUTES);
		//calcula la diferencia de años desde la actualidad hasta la fecha de nacimiento(until)
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Jornada j=(Jornada) o;
		if(dni.compareTo(j.dni)==0) {
			return entrada.compareTo(j.entrada);
		}else {
			return dni.compareTo(j.dni);
		}
		
	}
	
	
}
