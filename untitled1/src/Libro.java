public class Libro {
    private String titulo;
    private String[] autores;
    private int anioPublicacion;
    private String edicion;
    private String editorial;
    private int ejemplares;

    public Libro(String titulo, String[] autores,
                 int anioPublicacion, String edicion,
                 String editorial, int ejemplares) {

        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Titulo invalido");
        }

        if (autores == null || autores.length < 1
                || autores.length > 5) {
            throw new IllegalArgumentException(
                    "Debe registrar de 1 a 5 autores");
        }

        if (anioPublicacion <= 0 || edicion == null
                || edicion.trim().isEmpty()
                || editorial == null
                || editorial.trim().isEmpty()
                || ejemplares < 0) {
            throw new IllegalArgumentException(
                    "Datos del libro invalidos");
        }

        this.titulo = titulo;
        this.autores = autores.clone();
        this.anioPublicacion = anioPublicacion;
        this.edicion = edicion;
        this.editorial = editorial;
        this.ejemplares = ejemplares;
    }

    public boolean agregarEjemplares(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }

        ejemplares += cantidad;
        return true;
    }

    public boolean retirarEjemplares(int cantidad) {
        if (cantidad <= 0 || cantidad > ejemplares) {
            return false;
        }

        ejemplares -= cantidad;
        return true;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo
                + "\nAutores: " + String.join(", ", autores)
                + "\nAnio de publicacion: " + anioPublicacion
                + "\nEdicion: " + edicion
                + "\nEditorial: " + editorial
                + "\nEjemplares disponibles: " + ejemplares;
    }
}
