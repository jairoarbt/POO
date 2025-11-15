import java.util.Scanner;

public class SistemaControl {
    private Ascensor ascensor;
    private Piso[] pisos;

    public SistemaControl(int cantidadPisos) {
        ascensor = new Ascensor();
        pisos = new Piso[cantidadPisos];
        for (int i = 0; i < cantidadPisos; i++) {
            pisos[i] = new Piso(i + 1);
        }
    }

    public void menuInteraccion() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("--- Menú Ascensor ---");
            System.out.println("1. Llamar ascensor desde un piso");
            System.out.println("2. Seleccionar piso dentro del ascensor");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Desde qué piso llama el ascensor? ");
                    int pisoLlamada = sc.nextInt();

                    if (pisoLlamada >= 1 && pisoLlamada <= pisos.length) {
                        pisos[pisoLlamada - 1].presionarBotonLlamada(ascensor);
                    } else {
                        System.out.println(" Piso inválido el edificio solo tiene " + pisos.length + " pisos");
                    }
                    break;

                case 2:
                    System.out.print("¿A qué piso desea ir? ");
                    int pisoDestino = sc.nextInt();

                    
                    if (pisoDestino >= 1 && pisoDestino <= pisos.length) {
                        ascensor.irAPiso(pisoDestino);
                    } else {
                        System.out.println("Ese piso no existe el edificio tiene pisos  " + pisos.length );
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del edificio...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
}


