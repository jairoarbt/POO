import java.util.Scanner;

public class Boton {
    private String nombre;
    private boolean iluminado;

    public Boton() {}

    public Boton(String nombre) {
        this.nombre = nombre;
        this.iluminado = false;
    }

    public void presionar() {

       Scanner sc = new Scanner(System.in);
         boolean falloCorregido = false;
        
        while (!falloCorregido) {

            double probabilidad = Math.random(); //Se añade para agregar una probabilidad de fallo al presionar un boton

            if (probabilidad < 0.03 && iluminado) {
                System.out.println(" ¡ALERTA! Fallo al presionar el boton " + nombre );
                System.out.println("Vuelva a intentarlo");
                System.out.println( "Presione enter para reintentar");
                sc.nextLine();
            }else{
                falloCorregido = true; //si no hay fallo sale del ciclo
            }

        }

        System.out.println("Se presionó el botón " + nombre);
        encender();
    }

    public void encender() {
        if (!iluminado) {
            iluminado = true;
            System.out.println("Botón " + nombre + " encendido.");
        }
    }

    public void apagar() {
        if (iluminado) {
            iluminado = false;
            System.out.println("Botón " + nombre + " apagado.");
        }
    }

    public boolean isIluminado() {
        return iluminado;
    }
}




