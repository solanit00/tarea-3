package consultorio;

public class Especialista {
    private final String id;
    private String nombre;
    private String especialidad;

    public Especialista(String id, String nombre,
                        String especialidad) {
        if (id == null || id.trim().isEmpty()
                || nombre == null || nombre.trim().isEmpty()
                || especialidad == null
                || especialidad.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Datos del especialista invalidos");
        }

        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + " (" + especialidad + ")";
    }

}
