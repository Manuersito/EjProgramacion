package Tema_6_primeras_clases;

import java.security.PublicKey;

public class Prop_1_Vehiculo {
    String matricula;
    String marca;
    String color;

    public Prop_1_Vehiculo(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }
    
    public void mostrar() {
    	System.out.println("Matricula "+ getMatricula());
		System.out.println("Marca "+ getMarca());
		System.out.println("Color "+ getColor());
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
