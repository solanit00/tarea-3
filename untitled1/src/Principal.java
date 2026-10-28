public class Principal { public static void main(String[] args) {

    Catalogo catalogo = new Catalogo();

    Libro libro1 = new Libro(
            "Don Quijote de la Mancha",
            new String[]{"Miguel de Cervantes"},
            1605, "Primera edicion",
            "Francisco de Robles", 10
    );

    Libro libro2 = new Libro(
            "Cien anos de soledad",
            new String[]{"Gabriel Garcia Marquez"},
            1967, "Primera edicion",
            "Editorial Sudamericana", 5
    );

    System.out.println("=== PRUEBAS DEL SISTEMA ===");


    System.out.println("Prueba 1: Agregar libros");
    System.out.println(catalogo.agregarLibro(libro1));
    System.out.println(catalogo.agregarLibro(libro2));


    System.out.println("\nPrueba 2: Evitar duplicados");
    System.out.println(catalogo.agregarLibro(libro1));

    System.out.println("\nPrueba 3: Agregar ejemplares");
    System.out.println(libro1.agregarEjemplares(3));
    System.out.println("Existencias: "
            + libro1.getEjemplares());

    System.out.println("\nPrueba 4: Retirar ejemplares");
    System.out.println(libro1.retirarEjemplares(4));
    System.out.println("Existencias: "
            + libro1.getEjemplares());

    System.out.println("\nPrueba 5: Retiro no permitido");
    System.out.println(libro1.retirarEjemplares(100));
    System.out.println("Existencias: "
            + libro1.getEjemplares());

    System.out.println("\nPrueba 6: Buscar libro");
    Libro encontrado =
            catalogo.buscarLibro("Cien anos de soledad");

    System.out.println(encontrado != null
            ? encontrado : "Libro no encontrado");


    System.out.println("\nPrueba 7: Eliminar libro");
    System.out.println(
            catalogo.eliminarLibro("Cien anos de soledad"));

    System.out.println("\nPrueba 8: Catalogo final");
    catalogo.listarLibros();
}
}
