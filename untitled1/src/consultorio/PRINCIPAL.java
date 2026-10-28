package consultorio;

public class PRINCIPAL {


        public static void main(String[] args) {

            Consultorio consultorio = new Consultorio();

            Especialista medico = new Especialista(
                    "E01", "Ana Lopez", "Medicina general");

            Paciente paciente = new Paciente(
                    "P01", "Carlos Perez", 25);

            System.out.println("=== PRUEBAS DEL CONSULTORIO ===");

            // Prueba 1: registrar especialista
            System.out.println("1. Registrar especialista: "
                    + consultorio.registrarEspecialista(medico));

            // Prueba 2: registrar paciente
            System.out.println("2. Registrar paciente: "
                    + consultorio.registrarPaciente(paciente));

            // Prueba 3: evitar paciente duplicado
            System.out.println("3. Registrar paciente duplicado: "
                    + consultorio.registrarPaciente(paciente));

            // Prueba 4: programar cita
            Cita cita = new Cita(
                    "C01", paciente, medico,
                    "30/10/2026", "10:00",
                    "Consulta general");

            System.out.println("4. Programar cita: "
                    + consultorio.programarCita(cita));

            // Prueba 5: intentar registrar la misma cita
            System.out.println("5. Registrar cita duplicada: "
                    + consultorio.programarCita(cita));

            // Prueba 6: listar las citas
            System.out.println("\n6. Listado de citas:");
            consultorio.listarCitas();

            // Prueba 7: cancelar cita
            System.out.println("\n7. Cancelar cita: "
                    + consultorio.cancelarCita("C01"));

            // Prueba 8: eliminar paciente después de cancelar
            System.out.println("8. Eliminar paciente: "
                    + consultorio.eliminarPaciente("P01"));

            // Prueba 9: buscar cita inexistente
            System.out.println("9. Cancelar cita inexistente: "
                    + consultorio.cancelarCita("C99"));
        }
    }

