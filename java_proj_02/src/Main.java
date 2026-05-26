import model.*;
import service.InventarioService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InventarioService inventario = new InventarioService();

        int opcion;

        do {

            System.out.println("\n===== PIXEL KINGDOM STORE =====");
            System.out.println("1. Agregar videojuego");
            System.out.println("2. Agregar figura");
            System.out.println("3. Agregar tarjeta");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();

                    System.out.println("Código:");
                    String codigo = sc.nextLine();

                    System.out.println("Precio:");
                    double precio = sc.nextDouble();

                    System.out.println("Stock:");
                    int stock = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Plataforma:");
                    String plataforma = sc.nextLine();

                    System.out.println("Género:");
                    String genero = sc.nextLine();

                    System.out.println("Clasificación:");
                    String clasificacion = sc.nextLine();

                    Videojuego v = new Videojuego(
                            nombre,
                            codigo,
                            precio,
                            stock,
                            plataforma,
                            genero,
                            clasificacion
                    );

                    inventario.agregarProducto(v);

                    break;

                case 2:
                    
                    System.out.println("Funcionalidad pendiente...");
                    break;

                case 3:

                    System.out.println("Funcionalidad pendiente...");
                    break;

                case 4:

                    inventario.mostrarInventario();
                    break;

            }

        } while (opcion != 5);

        System.out.println("Sistema finalizado.");
    }
}