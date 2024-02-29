package ejEva_3;

import java.util.Scanner;

public class Gestimal {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opt;
    do {
        System.out.println("Elije opcion: \n 1. Listado \n 2. Alta \n 3. Baja \n 4. Modificacion \n 5.Entrada de mercancia \n 6. Salida de mercancia \n 7. Salir");
        opt= sc.nextInt();
    

        switch (opt) {
            case 1:
            Almacen.listarArticulos();
                break;

            case 2:
            System.out.println("Ingrese la descripción del artículo:");
            String descripcion = sc.nextLine();
    
            System.out.println("Ingrese el precio de compra del artículo:");
            double precioCompra = sc.nextDouble();
    
            System.out.println("Ingrese el precio de venta del artículo:");
            double precioVenta = sc.nextDouble();
    
            System.out.println("Ingrese el stock del artículo:");
            int stock = sc.nextInt();
    
            // Crear un nuevo objeto Articulos con los datos ingresados por el usuario
            Articulos nuevoArticulo = new Articulos(descripcion, precioCompra, precioVenta, stock);
    
            // Agregar el nuevo artículo al almacén
            Almacen.agregarArticulo(nuevoArticulo);
                break;

            case 3:
                
                break;

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;
        }
} while (opt !=7);

}
}
