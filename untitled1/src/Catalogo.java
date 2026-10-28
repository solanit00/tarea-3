import java.util.ArrayList;
public class Catalogo {
    private ArrayList<Libro> libros;

    public Catalogo() {
        libros = new ArrayList<>();
    }

    public boolean agregarLibro(Libro libro) {
        if (libro == null || buscarLibro(libro.getTitulo()) != null) {
            return false;
        }

        libros.add(libro);
        return true;
    }

    public Libro buscarLibro(String titulo) {
        if (titulo == null) {
            return null;
        }

        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }

        return null;
    }

    public boolean eliminarLibro(String titulo) {
        Libro libro = buscarLibro(titulo);

        if (libro == null) {
            return false;
        }

        libros.remove(libro);
        return true;
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("El catalogo esta vacio.");
            return;
        }

        for (Libro libro : libros) {
            System.out.println("--------------------");
            System.out.println(libro);
        }
    }
}
