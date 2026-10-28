package SENDERISMO;

public class Principal {
    public static void main(String[] args) {

        Carrera carrera =
                new Carrera("Carrera de Senderismo", 10);

        Participante p1 =
                new Participante(1, "Carlos Perez", 20, "Juvenil");

        Participante p2 =
                new Participante(2, "Ana Lopez", 25, "Libre");

        Participante p3 =
                new Participante(3, "Luis Garcia", 30, "Libre");

        System.out.println("PRUEBAS DEL SISTEMA");
        System.out.println("----------------------");

        System.out.println("Registrar Carlos: "
                + carrera.registrarParticipante(p1));

        System.out.println("Registrar Ana: "
                + carrera.registrarParticipante(p2));

        System.out.println("Registrar Luis: "
                + carrera.registrarParticipante(p3));

        System.out.println("Registrar numero duplicado: "
                + carrera.registrarParticipante(
                new Participante(1, "Pedro Ruiz", 22, "Libre")));

        System.out.println("\nRegistro de tiempos:");

        System.out.println("Carlos: "
                + carrera.registrarTiempo(1, 65));

        System.out.println("Ana: "
                + carrera.registrarTiempo(2, 58));

        System.out.println("Luis: "
                + carrera.registrarTiempo(3, 72));

        System.out.println("\nLista de participantes:");
        carrera.listarParticipantes();

        Participante ganador = carrera.obtenerGanador();

        System.out.println("\nGANADOR:");

        if (ganador != null) {
            System.out.println(ganador.getNombre()
                    + " con " + ganador.getTiempoMinutos()
                    + " minutos.");
        } else {
            System.out.println("Todavia no hay tiempos registrados.");
        }
    }
}
