public class punto53 {

    public static void main(String[] args) {


        int suma, i;

        // a) Estructura repetir (do-while)
        suma = 0;
        i = 1;
        do {
            suma += i;
            i++;
        } while (i <= 100);
        System.out.println("a) Suma con repetir (do-while): " + suma);

        // b) Estructura mientras (while)
        suma = 0;
        i = 1;
        while (i <= 100) {
            suma += i;
            i++;
        }
        System.out.println("b) Suma con mientras (while): " + suma);

        // c) Estructura desde (for)
        suma = 0;
        for (i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("c) Suma con desde (for): " + suma);
        



















    }
    
}
