import java.util.Scanner;

public class puntos5punto1al5punto10 {

    public static void main(String[] args) {

        //punto 5.2
        System.out.println("Punto 5.2");

         Scanner sc = new Scanner(System.in);

        // Entrada del mes 
        System.out.print("Introduce numero del mes (1-12): ");
        int mes = sc.nextInt();

        //si el año es bisiesto
        System.out.print("Introduce 1 si el año es bisiesto, 0 si no lo es: ");
        int bisiestoInt = sc.nextInt();
        boolean bisiesto = (bisiestoInt == 1);

        int dias;

        switch (mes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;

            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;

            case 2: // Febrero
                if (bisiesto) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;

            default:
                dias = -1;
        }

        if (dias != -1) {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes no válido.");
        }

        sc.close();

        























    }





















}