public class EjecutarElevador {
    public static void main(String[] args) {
        System.out.println("--- Simulador Ascensor ---");
        Edificio edificio = new Edificio();
        edificio.getSistemaControl().menuInteraccion();
    }
}

