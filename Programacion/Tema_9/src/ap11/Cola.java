package ap11;

public interface Cola{
	
	void encolar(String nuevo);
		
	String desencolar();
	
	default void encolarMultiples(String nuevo,int repeticiones) {//IMP EL DEFAULT
		for(int i=0;i<repeticiones;i++) {
			encolar(nuevo);
		}
		
	}
}
