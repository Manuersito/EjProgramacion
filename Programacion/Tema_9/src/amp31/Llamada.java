package amp31;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Llamada implements Comparable{

	Integer tfnoCliente,tfnoInter,zona;
	boolean saliente;
	LocalDateTime inicio;
	LocalDateTime fin;
	final Integer[]tarifas= {50,25,30,42,27};
	
	public Llamada(Integer tfnoCliente, Integer tfnoInter, Integer zona, boolean saliente, String inicio,
			String fin) {
		super();
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		this.tfnoCliente = tfnoCliente;
		this.tfnoInter = tfnoInter;
		this.zona = zona;
		this.saliente = saliente;
		this.inicio = LocalDateTime.parse(inicio, f);
		this.fin = LocalDateTime.parse(fin, f);
	}
	
	public int tiempo() {
		return (int) inicio.until(fin, ChronoUnit.MINUTES);
	}
	
	public double coste() {
		
		if(saliente==false) {
			return 0;
		}else {
			return (double)(tiempo()*tarifas[zona])/100;//lo paso a euros
		}
	}

	@Override
	public String toString() {
		return "Llamada [tfnoCliente=" + tfnoCliente + ", tfnoInter=" + tfnoInter + ", inicio=" + inicio.getYear()  + "/"
	+ inicio.getMonth().getValue() + "/" + inicio.getDayOfMonth() + " "+inicio.getHour() +":"+inicio.getMinute()+":"+inicio.getSecond()+", "
			+ "fin="+ fin.getYear()  + "/"
	+ fin.getMonth().getValue() + "/" + fin.getDayOfMonth() + " "+fin.getHour() +":"+fin.getMinute()+":"+fin.getSecond()+", duracion=" + tiempo() + " minutos, coste=" + coste() + " €]\n";
	}

	@Override
	public int compareTo(Object o1) {
		// TODO Auto-generated method stub
		Llamada ll=(Llamada) o1;
		if(tfnoCliente.compareTo(ll.tfnoCliente)==0) {
			return inicio.compareTo(fin);
		}
		return tfnoCliente.compareTo(ll.tfnoCliente);
	}
	
	
	
	
}
