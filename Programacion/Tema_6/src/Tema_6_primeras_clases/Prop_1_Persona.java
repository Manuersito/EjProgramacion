package Tema_6_primeras_clases;

public class Prop_1_Persona {
   private String nombre;
   private int edad;

    public Prop_1_Persona() {
		
	}


    public Prop_1_Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}



	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
}
