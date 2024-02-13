package ap13;

public class Futbolista implements Comparable {

	String dni,nombre;
	int edad,goles;
	public Futbolista(String dni, String nombre, int edad, int goles) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.goles = goles;
	}
	@Override
	public String toString() {
		return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", goles=" + goles + "]\n";
	}
	
	public boolean equals(Futbolista otro) {
		if(dni.compareTo(otro.dni)==0) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Futbolista fut=(Futbolista) o;
		return dni.compareTo(fut.dni);
	}
	
	
}
