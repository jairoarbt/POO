 import java.util.Scanner;

public class Edificio {
    private SistemaControl sistemaControl;
    
    //Defini cantidad de pisos para crear el sistema de control del edificio
    public Edificio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de pisos que tiene el edificio: "); 
        int cantidadPisos = sc.nextInt(); // se dimensiona el edificio en pisos segun la entrada
        sistemaControl = new SistemaControl(cantidadPisos);
    }

    public SistemaControl getSistemaControl() { 
        return sistemaControl;
    }
}

 