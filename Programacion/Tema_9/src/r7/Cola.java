package r7;

public interface Cola{
	
	void encolar(Object nuevo);
		
	Object desencolar();
	
	default void encolarMultiples(Object nuevo,int repeticiones) {//IMP EL DEFAULT
		for(int i=0;i<repeticiones;i++) {
			encolar(nuevo);
		}
		
	}
}
