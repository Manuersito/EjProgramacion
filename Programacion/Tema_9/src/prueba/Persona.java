package prueba;

public class Persona implements Cliente,Empleado{

	
	String dni,nombre;
	boolean empleado;
	boolean cliente;
	int numHoras;
	int saldo;
	public Persona(String dni, String nombre, boolean empleado, boolean cliente) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.empleado = empleado;
		this.cliente = cliente;
		//para inicializar:
		this.numHoras=0;
		this.saldo=0;
	}
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", empleado=" + empleado + ", cliente=" + cliente
				+ ", numHoras=" + numHoras + ", saldo=" + saldo + "]";
	}

	@Override
	public void aumentarHoras(int cantidad) {
		// TODO Auto-generated method stub
		numHoras+=cantidad;
	}
	@Override
	public void aumentarSaldo(int cantidad) {
		// TODO Auto-generated method stub
		saldo+=cantidad;
	}
	
	
	
}
