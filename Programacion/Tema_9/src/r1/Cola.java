package r1;
/*En Java, una interfaz es una colección de métodos abstractos (es decir, métodos sin implementación) y constantes que 
se definen como una plantilla para una clase. Las interfaces se utilizan para definir un conjunto de métodos que una 
clase debe implementar, pero no lograron una implementación concreta de esos métodos. En lugar de eso, una clase que 
implementa una interfaz debe proporcionar su propia implementación de cada uno de los métodos definidos en la interfaz.

En otras palabras, una interfaz en Java es un contrato que una clase debe seguir si quiere cumplir con las 
especificaciones de esa. Al implementar una interfaz, una clase adquiere los métodos y constantes definidos en 
la interfaz y se asegura de que los métodos implementados sigan el mismo formato y estructura que se especifican 
en la interfaz. Las interfaces se utilizan para crear una separación clara entre la combinación de un comportamiento
y su implementación concreta, lo que permite una mayor modularidad y flexibilidad en el diseño de un programa.*/

public interface Cola{
	
	void encolar(Integer n);
		
	Integer desencolar();
	
	default void encolarMultiples(Integer n,int repeticiones) {//IMP EL DEFAULT
		for(int i=0;i<repeticiones;i++) {
			encolar(n);
		}
		
	}

}
