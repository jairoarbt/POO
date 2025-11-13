public class Ascensor {
    private int pisoActual;
    private String direccion;
    private Puerta puerta;

    public Ascensor() {
        this.pisoActual = 1;
        this.direccion = "ninguna";
        this.puerta = new Puerta();
    }

    public void irAPiso(int pisoDestino) {
        System.out.println("Ascensor recibiendo solicitud para el piso " + pisoDestino);
        if (pisoDestino == pisoActual) {
            System.out.println("Ya estás en el piso " + pisoActual);
            return;
        }

        puerta.cerrarPuerta();
        direccion = (pisoDestino > pisoActual) ? "subiendo" : "bajando";

        while (pisoActual != pisoDestino) {
            pisoActual += (direccion.equals("subiendo")) ? 1 : -1;
            System.out.println("Ascensor " + direccion + "... Piso actual: " + pisoActual);
            try { Thread.sleep(800); } catch (InterruptedException e) {}
        }

        direccion = "ninguna";
        puerta.abrirPuerta();
        System.out.println("Llegaste al piso " + pisoActual);
    }

    public int getPisoActual() {
        return pisoActual;
    }
}
 