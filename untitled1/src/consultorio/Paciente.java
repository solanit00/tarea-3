package consultorio;

public class Paciente {
    private final String id;
    private String nombre;
    private int edad;

    public Paciente(String id, String nombre, int edad) {
        if (id == null || id.trim().isEmpty()
                || nombre == null || nombre.trim().isEmpty()
                || edad < 0 || edad > 120) {
            throw new IllegalArgumentException(
                    "Datos del paciente invalidos");
        }

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + ", edad: " + edad;
    }
}
