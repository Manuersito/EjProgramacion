package App;

import java.sql.Date;
import java.time.LocalDate;

public class Clientes3_1 {
	@Override
	public String toString() {
		return "Clientes3_1 [DNI=" + DNI + ", Nombre Completo=" + nombreComp + ", Edad=" + getEdad() + ", Saldo="
				+ saldo + "]";
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombreComp() {
		return nombreComp;
	}
	public void setNombreComp(String nombreComp) {
		this.nombreComp = nombreComp;
	}
	public String getFechaNaci() {
		return fechaNaci;
	}
	public void setFechaNaci(String fechaNaci) {
		this.fechaNaci = fechaNaci;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	String DNI;
	String nombreComp;
	String fechaNaci;
	double saldo;
	int edad;
	public Clientes3_1(String dNI, String nombreComp, String fechaNaci, double saldo) {
		super();
		DNI = dNI;
		this.nombreComp = nombreComp;
		this.fechaNaci = fechaNaci;
		this.saldo = saldo;
	}
	public int getEdad() {
		LocalDate fecha = LocalDate.parse(fechaNaci);
	    LocalDate hoy = LocalDate.now() ; 
	    
	    edad = hoy.getYear()-fecha.getYear();
	    
	    return edad;
	    
	}
	
}
