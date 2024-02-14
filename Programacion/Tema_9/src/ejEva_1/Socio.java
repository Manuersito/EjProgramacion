package ejEva_1;

import java.util.Date;

public class Socio {
int id;
String nombre;
Date fechaNacimiento;

public Socio() {
	
}

public Socio(int id, String nombre, Date fechaNacimiento) {
	this.id = id;
	this.nombre = nombre;
	this.fechaNacimiento = fechaNacimiento;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Date getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}


}
