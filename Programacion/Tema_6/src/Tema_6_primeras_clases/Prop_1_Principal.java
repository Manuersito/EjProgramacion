package Tema_6_primeras_clases;

import java.util.Scanner;

// Importa la clase Prop_1_Persona


public class Prop_1_Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        // Crea una instancia de la clase Prop_1_Persona
        Prop_1_Persona p = new Prop_1_Persona("Alvaro", 20);

        // Puedes imprimir la información o realizar otras operaciones con la instancia
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());

		Prop_1_Vehiculo v = new Prop_1_Vehiculo("2345CPT","Toyota","Blanco");

		v.mostrar();
		System.out.println("que color quieres ahora?");
		String color = sc.nextLine();
		v.setColor(color);
		System.out.println("Color "+ v.getColor());
    }
}
