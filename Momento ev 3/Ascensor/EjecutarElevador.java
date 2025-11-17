import java.util.Scanner;

public class EjecutarElevador {
    public static void main(String[] args) {
        System.out.println("--- Simulador Ascensor ---");

        //prueba de botones
        System.out.println("Prueba de sistema de botones");

        Boton botonPrueba = new Boton("prueba de boton");
        System.out.println("Probando el funcionamiento del boton..");
        botonPrueba.presionar(); // El primero debe funcionar sin fallos
        botonPrueba.presionar();  // el segundo debe generar una probabilidad de error

        System.out.println("Prueba finalizada, preisione enter para iniciar el ascensor");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
         System.out.println("Iniciando ascensor");
        Edificio edificio = new Edificio();

        edificio.getSistemaControl().menuInteraccion();
    }
}

