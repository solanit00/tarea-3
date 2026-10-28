package SENDERISMO;
import java.util.ArrayList;
public class Carrera {
    private String nombre;
    private double distanciaKm;
    private ArrayList<Participante> participantes;

    public Carrera(String nombre, double distanciaKm) {
        if (nombre == null || nombre.isBlank()
                || distanciaKm <= 0
                || !Double.isFinite(distanciaKm)) {
            throw new IllegalArgumentException(
                    "Datos de carrera invalidos");
        }

        this.nombre = nombre;
        this.distanciaKm = distanciaKm;
        participantes = new ArrayList<>();
    }

    public boolean registrarParticipante(Participante p) {
        if (p == null || buscarParticipante(p.getNumero()) != null) {
            return false;
        }

        participantes.add(p);
        return true;
    }

    public Participante buscarParticipante(int numero) {
        for (Participante p : participantes) {
            if (p.getNumero() == numero) {
                return p;
            }
        }

        return null;
    }

    public boolean registrarTiempo(int numero, double tiempo) {
        Participante p = buscarParticipante(numero);

        if (p == null) {
            return false;
        }

        return p.registrarTiempo(tiempo);
    }

    public void listarParticipantes() {
        if (participantes.isEmpty()) {
            System.out.println("No hay participantes registrados.");
            return;
        }

        for (Participante p : participantes) {
            System.out.println(p);
        }
    }

    public Participante obtenerGanador() {
        Participante ganador = null;

        for (Participante p : participantes) {
            if (p.getTiempoMinutos() > 0
                    && (ganador == null
                    || p.getTiempoMinutos()
                    < ganador.getTiempoMinutos())) {
                ganador = p;
            }
        }

        return ganador;
    }
}
