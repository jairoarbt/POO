public class Puerta {

    private boolean abierta;

    public Puerta() {
        this.abierta = true; // La puerta inicia abierta por defecto
    }

    public void abrirPuerta() {
        if (!abierta) {
            System.out.println("La puerta se está abriendo...");
            abierta = true;
        } else {
            System.out.println("La puerta ya está abierta.");
        }
    }

    public void cerrarPuerta() {

        // -------- SENSOR DE OBSTÁCULO 3% --------
        double probabilidad = Math.random(); // número entre 0.0 – 1.0

        if (probabilidad < 0.03) { // 3% de probabilidad de obstáculo
            System.out.println("⚠️ No se puede cerrar la puerta, hay un obstáculo en el sensor.");
            return; // evita el cierre por seguridad
        }
        // ----------------------------------------

        if (abierta) {
            System.out.println("La puerta se está cerrando...");
            abierta = false;
        } else {
            System.out.println("La puerta ya está cerrada.");
        }
    }

    public boolean estaAbierta() {
        return abierta;
    }
}
