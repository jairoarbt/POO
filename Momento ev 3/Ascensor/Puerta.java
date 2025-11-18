import java.util.Scanner;

public class Puerta {

    private boolean abierta;

    public Puerta() {
        this.abierta = true; // La puerta inicia abierta
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
        Scanner sc = new Scanner(System.in);
        boolean obstaculoDetectado = false;

        do {
            // -------- SENSOR DE OBSTÁCULO 3% --------
            double probabilidad = Math.random(); 
            obstaculoDetectado = (probabilidad < 0.98);
            //Fallo del sensonr por obstaculo del 3%

            if (obstaculoDetectado) {
                System.out.println(" ¡ALERTA! ");
                System.out.println("No se puede cerrar la puerta, hay un obstáculo en el sensor.");
                System.out.println("1. Intentar cerrar otra vez");
                System.out.println("2. Quitar obstáculo"); //Solucion para seguir el codigo
                System.out.print("Seleccione una opción: ");

                int opcion = sc.nextInt();

                if (opcion == 2) {
                    System.out.println(" Obstáculo retirado ");
                    obstaculoDetectado = false;  //se permite cerrar
                } else {
                    System.out.println("Reintentando cierre..");
                }
            }
        // deja el ciclo si no hay obstaculo
        } while (obstaculoDetectado);  

        if (abierta) {
            System.out.println("La puerta se está cerrando.."); 
            abierta = false;
        } else {
            System.out.println("La puerta ya está cerrada"); 
        }
    }

    public boolean estaAbierta() {
        return abierta;
    }
}

