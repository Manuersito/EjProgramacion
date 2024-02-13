package r7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

public class Socio implements Comparable{
	
	int id;
	String nombre;
	LocalDate fechaNac;
	Socio[]conjSocios;
	
	
	public Socio(int id, String nombre, String fechaNac) {//cambiamos la fecha a string solo para rellenarla
		super();
		this.id = id;
		this.nombre = nombre;
		 DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // formato de la fecha
		this.fechaNac =  LocalDate.parse(fechaNac, formato);
	}
	
	public int edad() {
		return (int) fechaNac.until(LocalDate.now(),ChronoUnit.YEARS);
		//calcula la diferencia de años desde la actualidad hasta la fecha de nacimiento(until)
	}
	

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" +edad() + "]\n";//IMP COMO PONGO EL METODO edad
	}

		/*public int compareTo(Object o) {
		//usamos el compareTo con objetos
		//int resultado;
		Socio otroSocio=(Socio) o;//hacemos un castin para convertir el objeto
		//generico en un objeto Socio
		/*if(id<otroSocio.id) {
			resultado=-1;
		}else if(id>otroSocio.id){
			resultado=1;
		}else {//son iguales
			resultado=0;
		}
		return resultado;
	}*/
	
	/*APP20
	 * public int compareTo(Object o) {
		Socio otroSocio=(Socio) o;
		if(edad()-otroSocio.edad()==0) {
			return id-otroSocio.id;
		}else {
			return edad()-otroSocio.edad();//comparamos 2 metodos
		}
	}*/

	//APP21
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Socio otroSocio=(Socio) o;
		return -fechaNac.compareTo(otroSocio.fechaNac);//EL - ES PARA DE MENOR A MAYOR FECHA NACIMIENTO, SIN EL -
		//SERIA DE MAYOR A MENOR FECHA DE NACIMIENTO
	}*/

			
			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				Socio otroSocio=(Socio) o;
				return edad()-otroSocio.edad();
			}
			
			
			
	

}
