

public class Guitarra extends Instrumento {
    private int numeroCuerdas;
    private boolean electrica;

    // Constructor
    public Guitarra(String nombre, String tipo, String material, int numeroCuerdas, boolean electrica) {
        super(nombre, tipo, material); // Llama al constructor del padre
        this.numeroCuerdas = numeroCuerdas;
        this.electrica = electrica;
    }

    // Método propio de la subclase
    public void rasguear() {
        System.out.println(nombre + " está siendo rasgueada con ritmo.");
    }

    // Sobrescribir (override) método de la clase padre
    @Override
    public void tocar() {
        if (electrica) {
            System.out.println(nombre + " está sonando a través de un amplificador.");
        } else {
            System.out.println(nombre + " está sonando de forma acústica.");
        }
    }

    // Mostrar información específica
    public void mostrarGuitarra() {
        mostrarInfo();
        System.out.println("Número de cuerdas: " + numeroCuerdas);
        System.out.println("¿Es eléctrica?: " + (electrica ? "Sí" : "No"));
        System.out.println("--------------------------------");
    }
}
