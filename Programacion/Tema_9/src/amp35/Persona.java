package amp35;

public class Persona implements Cliente,Empleado{

	String dni;
	String nombre;
	boolean cliente;
	boolean empleado;
	Integer numHoras;
	Integer saldo;
	public Persona(String dni, String nombre, boolean cliente, boolean empleado) {//puedo poner mas atributos en el
		//constructor que los que se necesite para crear un objeto persona
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.cliente = cliente;
		this.empleado = empleado;
		this.numHoras=0;
		this.saldo=0;
		
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	@Override
	public int aumentarSaldo(int cantidad) {
		// TODO Auto-generated method stub
		return saldo+=cantidad;
	}
	@Override
	public int aumentarHoras(int cantidad) {
		// TODO Auto-generated method stub
		return numHoras+=cantidad;
	}
	

	
	
}
