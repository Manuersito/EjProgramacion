package Tema_6_Pila_y_Cola;

import Tema_6_Lista.*;

public class Pila {
private Lista lista;

public Pila() {
	lista = new Lista();
}

public void apilar(Integer Entero) {
	lista.insertarFinal(Entero);
}
public Integer desapilar(){

	return lista.eliminar(lista.tabla.length - 1);
}

public void mostrar() {
	lista.mostrar();
}
}



