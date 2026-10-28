package SENDERISMO;

public class Participante {
    private final int numero;
    private String nombre;
    private int edad;
    private String categoria;
    private double tiempoMinutos;

    public Participante(int numero, String nombre,
                        int edad, String categoria) {

        if (numero <= 0 || nombre == null || nombre.isBlank()
                || edad <= 0 || categoria == null
                || categoria.isBlank()) {
            throw new IllegalArgumentException(
                    "Los datos del participante son invalidos");
        }

        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.tiempoMinutos = 0;
    }

    public boolean registrarTiempo(double tiempo) {
        if (tiempo <= 0 || !Double.isFinite(tiempo)) {
            return false;
        }

        tiempoMinutos = tiempo;
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getTiempoMinutos() {
        return tiempoMinutos;
    }

    public String toString() {
        return "Numero: " + numero
                + "\nNombre: " + nombre
                + "\nEdad: " + edad
                + "\nCategoria: " + categoria
                + "\nTiempo: "
                + (tiempoMinutos > 0
                ? tiempoMinutos + " minutos"
                : "Sin registrar")
                + "\n----------------------";
    }
}
