package consultorio;
import java.util.ArrayList;
public class Consultorio {


        private ArrayList<Especialista> especialistas;
        private ArrayList<Paciente> pacientes;
        private ArrayList<Cita> citas;

        public Consultorio() {
            especialistas = new ArrayList<>();
            pacientes = new ArrayList<>();
            citas = new ArrayList<>();
        }

        public boolean registrarEspecialista(Especialista e) {
            if (e == null || buscarEspecialista(e.getId()) != null) {
                return false;
            }

            especialistas.add(e);
            return true;
        }

        public boolean registrarPaciente(Paciente p) {
            if (p == null || buscarPaciente(p.getId()) != null) {
                return false;
            }

            pacientes.add(p);
            return true;
        }

        public Especialista buscarEspecialista(String id) {
            for (Especialista e : especialistas) {
                if (e.getId().equalsIgnoreCase(id)) {
                    return e;
                }
            }
            return null;
        }

        public Paciente buscarPaciente(String id) {
            for (Paciente p : pacientes) {
                if (p.getId().equalsIgnoreCase(id)) {
                    return p;
                }
            }
            return null;
        }

        public boolean programarCita(Cita cita) {
            if (cita == null) {
                return false;
            }

            if (buscarCita(cita.getId()) != null) {
                return false;
            }

            if (buscarPaciente(cita.getPaciente().getId()) == null
                    || buscarEspecialista(
                    cita.getEspecialista().getId()) == null) {
                return false;
            }

            citas.add(cita);
            return true;
        }

        public Cita buscarCita(String id) {
            for (Cita c : citas) {
                if (c.getId().equalsIgnoreCase(id)) {
                    return c;
                }
            }
            return null;
        }

        public boolean cancelarCita(String id) {
            Cita cita = buscarCita(id);

            if (cita == null || cita.getEstado().equals("Cancelada")) {
                return false;
            }

            cita.cancelar();
            return true;
        }

        public boolean eliminarPaciente(String id) {
            Paciente paciente = buscarPaciente(id);

            if (paciente == null) {
                return false;
            }

            for (Cita c : citas) {
                if (c.getPaciente().getId().equalsIgnoreCase(id)
                        && c.getEstado().equals("Programada")) {
                    return false;
                }
            }

            pacientes.remove(paciente);
            return true;
        }

        public void listarCitas() {
            if (citas.isEmpty()) {
                System.out.println("No hay citas registradas.");
                return;
            }

            for (Cita c : citas) {
                System.out.println("--------------------");
                System.out.println(c);
            }
        }
    }



