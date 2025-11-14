 import java.util.Scanner;

public class Edificio {
    private SistemaControl sistemaControl;

    public Edificio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de pisos que tiene el edificio: ");
        int cantidadPisos = sc.nextInt();
        sistemaControl = new SistemaControl(cantidadPisos);
    }

    public SistemaControl getSistemaControl() {
        return sistemaControl;
    }
}

 