package ejEva_3;

import java.util.Arrays;

public class Almacen {
    private static Articulos[] articulos;
    private static int capacidad;
    private static int cantidadArticulos;

    public Almacen() {
        this.capacidad = 0; // Inicializamos la capacidad en 0
        this.articulos = new Articulos[0]; // Inicializamos el array vacío
        this.cantidadArticulos = 0;
    }

    // Método para agregar un nuevo artículo al almacén
    public static void agregarArticulo(Articulos articulo) {
            capacidad++;
            // Creamos un nuevo array de artículos con la nueva capacidad
            articulos = Arrays.copyOf(articulos, capacidad);
        
        // Agregamos el nuevo artículo al final del array
        articulos[cantidadArticulos] = new Articulos(null, cantidadArticulos, capacidad, cantidadArticulos);
        cantidadArticulos++;
    }

    public static void listarArticulos() {
        System.out.println("Listado de Artículos:");
        for (Articulos articulo : articulos) {
            if (articulo != null) {
                System.out.println(articulo.toString());
            }
        }
    }

    // Otros métodos para gestionar el almacén, como listar, eliminar, modificar, etc.
    
}
