public class Ascensor {
    
    //atributos en private para encapsulamiento
    private int pisoActual;
    private String direccion;
    private Puerta puerta;

    public Ascensor() {
        this.pisoActual = 1; 
        this.direccion = "Ninguna";  
        this.puerta = new Puerta();   
    }

    
    public void irAPiso(int pisoDestino) {
        System.out.println("Ascensor recibiendo solicitud para el piso " + pisoDestino);
        if (pisoDestino == pisoActual) {
            System.out.println("Ya estás en el piso " + pisoActual); //mensaje de error para seguir la logica de donde se encuentra el ascensor
            return;
        }

        puerta.cerrarPuerta();
        direccion = (pisoDestino > pisoActual) ? "Subiendo" : "Bajando";  // Determinar direccion

        while (pisoActual != pisoDestino) {
            pisoActual += (direccion.equals("Subiendo")) ? 1 : -1;  //Moverse en un piso a la vez
            System.out.println("Ascensor " + direccion + "... Piso actual: " + pisoActual); 
            try { Thread.sleep(800); } catch (InterruptedException e) {}
        }

        direccion = "Ninguna";  
        puerta.abrirPuerta(); 
        System.out.println("Llegaste al piso " + pisoActual); //Detenerse, accion abrir puerta y confirmar llegada
    }

    public int getPisoActual() {
        return pisoActual;
    }
}
 