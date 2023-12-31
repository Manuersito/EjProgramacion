package Tema_5_Propuestas_Profesora;

import java.util.*;

public class Menu_tablas_clase_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, nElemento = 0;
        boolean ordenado=false;
        int[] vector = new int[10];

        do {
            menu();
            op = opcion();

            switch (op) {
                case 1:
                    nElemento = menuInsertar(vector, nElemento);
                    break;

                case 2:
                   nElemento = menuEliminar(vector, nElemento);
                    break;

                case 3:
                   modVector(vector, nElemento);
                    break;

                case 4:
                   listar(vector);
                    break;

                case 5:
                	ordenar(vector,nElemento);
                       ordenado=true;     

                	break;

                case 6:
                    buscar(vector, nElemento, ordenado);
                    break;
            }

        } while (op != 7);
    }

    public static int opcion() {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        return op;
    }

    public static void menu() {
    	System.out.println();
        System.out.println(
                "Elige opcion: \n 1.Insertar \n 2.Eliminar \n 3.Modificar \n 4.Listar \n 5.Ordenar \n 6.Buscar \n 7.Salir");
    }

    public static int menuInsertar(int vector[], int nElemento) {
        int op;

        System.out.println(
                "Elige opcion: \n 1.Insertar por principio \n 2.Insertar por final \n 3.Insertar en lugar concreto \n 4.Salir");

        op = opcion();

        switch (op) {
            case 1:
                nElemento = insertarP(vector, nElemento);
                break;

            case 2:
                nElemento = insertarF(vector, nElemento);
                break;

            case 3:
                // Agrega la lógica para la opción 3
                break;
        }

        return nElemento;
    }

    

	public static int menuEliminar(int[] vector, int nElemento) {
        int op;

        System.out.println(
                "Elige opcion: \n 1.Eliminar por principio \n 2.Eliminar por final \n 3.Eliminar en lugar concreto \n 4.Salir");

        op = opcion();

        switch (op) {
            case 1:
                eliminarP(vector, nElemento);
                break;

            case 2:
                eliminarF(vector, nElemento);
                break;

            case 3:
                eliminarc(vector, nElemento);
                break;
        }
		return nElemento;
    }

	
	// metodo insertar principio
	// pasamos el vector y el numero de elemntos que hay en el array
    private static int insertarP(int[] vector, int nElemento) {
        int num;
// este if mira si hay 1 hueco en el array si lo hay procede a meterlo y si no da error
        if (nElemento == vector.length) {
            System.out.println("Error");
        } else {
            System.out.println("Que numero quieres meter");
            num = opcion();
// este for mueve todos los elemento 1 posicion a la derecha para poder insertar por el principio
            for (int i = nElemento; i > 0; i--) {
                vector[i] = vector[i - 1];
            }
// aqui metemos en la posicion 0 del array el numero elejido y sumamos 1 al contador de elementos
            vector[0] = num;
            nElemento++;

        }

        return nElemento;
    }
    
    
    
    //
    private static int insertarF(int[] vector, int nElemento) {
    	 if (nElemento == vector.length) {
             System.out.println("Error");
         } else {
             System.out.println("Que numero quieres meter");
             int num = opcion();

             
 // aqui metemos en la posicion nElemento del array el numero elejido y sumamos 1 al contador de elementos
             vector[nElemento-1] = num;
             nElemento++;

         }

		return nElemento;
	}
    
    
    
    
    
    //metodo para eliminar el primer numero del array
    
    private static int eliminarP(int[] vector, int nElemento) {
//aqui se valida los datos para que si el vector este vacio no puedas eliminar nada
      if (nElemento==0) {
		System.out.println("El vector esta vacio");
	} else {
// este for mueve todos los elemento 1 posicion a la derecha para poder insertar por el principio
		for (int i = 0; i < nElemento-1; i++) {
			vector[i]=vector[i+1];
		}
// aqui metemos en la posicion 0 del array el numero elejido y restamos 1 al contador de elementos
        vector[nElemento-1]=0;
        nElemento--;
	}
            
                    

        return nElemento;
    }
    
    
    //Metodo para eliminar el ultimo elemento de la tabla
    private static int eliminarF(int[] vector, int nElemento) {
    	if (nElemento==0) {
    		System.out.println("El vector esta vacio");
    	} else {
    
    		
    // aqui metemos en la posicion de nElemento del array el numero elejido y restamos 1 al contador de elementos
            vector[nElemento-1]=0;
            nElemento--;
    	}

        

		return nElemento;
	}

      //metodo para eliminar cualquier numero del array
    
    private static int eliminarc(int[] vector, int nElemento) {
//aqui se valida los datos para que si el vector este vacio no puedas eliminar nada
      if (nElemento==0) {
		System.out.println("El vector esta vacio");
	} else {
// este for mueve todos los elemento 1 posicion a la derecha para poder insertar por el principio
		for (int i = 0; i < nElemento-1; i++) {
			vector[i]=vector[i+1];
		}
// aqui metemos en la posicion 0 del array el numero elejido y restamos 1 al contador de elementos
        System.out.println("Que posicion quieres borrar");
        int x = opcion();
        vector[x]=0;
        nElemento--;
	}
            
                    

        return nElemento;
    }
    
    
    
    //metodo para poder modificar el array
    public static int modVector(int[] vector, int nElemento) {
    	//pedimos el numero que queremos meter y en la posicion que lo queremos meter
    	int num,posicion;
    	
    	do {
    		System.out.println("Escriba la posicion que quieras modificar, recuerda que la primera posicion es 0 y la ultima 9");
    		posicion=opcion();
    		System.out.println("Escriba el numero que quieras introducir");
    		num=opcion();
			
		} while (posicion<0 || posicion>nElemento-1);
    	vector[posicion]=num;
    	
    	nElemento++;
		return nElemento;
		
	}
    
    // metodo para listar el array
    public static void listar(int[] vector) {
    	for (int i = 0; i < vector.length; i++) {
    		System.out.print(vector[i]+", ");
    	}
    	System.out.println();
    }
    
    
    
    //metodo ordenar el array
    
    public static int[] ordenar(int[] vector,int nElemento) {
    	int i, j, aux;
        for (i = 0; i < nElemento - 1; i++) {
            for (j = 0; j < nElemento - i - 1; j++) {                                                              
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    	
    	return vector;
		
	}
    
    
    //metodo para buscar
    
    public static void buscar(int[] vector,int nElemento, boolean ordenado) {
    	 System.out.println("Que numero quiers buscar?");
                
        int pos = 0,x = opcion();

    	
    	if (ordenado==true) {
			//busqueda dicotomica
    		 while (pos <= nElemento) {
    	            int i = x + (nElemento - pos) / 2;

    	            if (vector[i] == x)
                    pos = i;
    	                System.out.println(pos);
    	 
    	            if (vector[i] < x)
    	                pos = i + 1;
    	 
    	            else
    	                pos = i - 1;
    	        }
    	        
		} else {
			//busqueda secuencial
            for (int i = 0; i < vector.length; i++) {
                if (vector[i]==x) {
                    pos=i;
                }
            }
		}
    	
		System.out.println(pos);
		
	}
    
}
