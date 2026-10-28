package consultorio;

public class Cita {


    private final String id;
    private final Paciente paciente;
    private final Especialista especialista;
    private String fecha;
    private String hora;
    private String motivo;
    private String estado;

    public Cita(String id, Paciente paciente,
                Especialista especialista, String fecha,
                String hora, String motivo) {

        if (id == null || id.trim().isEmpty()
                || paciente == null || especialista == null
                || fecha == null || fecha.trim().isEmpty()
                || hora == null || hora.trim().isEmpty()
                || motivo == null || motivo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Datos de la cita invalidos");
        }

        this.id = id;
        this.paciente = paciente;
        this.especialista = especialista;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = "Programada";
    }

    public String getId() {
        return id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Especialista getEspecialista() {
        return especialista;
    }

    public String getEstado() {
        return estado;
    }

    public void cancelar() {
        estado = "Cancelada";
    }

    @Override
    public String toString() {
        return "Cita: " + id
                + "\nPaciente: " + paciente.getNombre()
                + "\nEspecialista: " + especialista.getNombre()
                + "\nFecha: " + fecha
                + "\nHora: " + hora
                + "\nMotivo: " + motivo
                + "\nEstado: " + estado;
    }
}
