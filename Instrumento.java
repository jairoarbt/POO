// Clase padre o superclase
public class Instrumento {
    // Atributos comunes a todos los instrumentos
    protected String nombre;
    protected String tipo;
    protected String material;

    // Constructor
    public Instrumento(String nombre, String tipo, String material) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.material = material;
    }

    // Métodos comunes
    public void afinar() {
        System.out.println(nombre + " está siendo afinado.");
    }

    public void tocar() {
        System.out.println(nombre + " está siendo tocado.");
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Material: " + material);
        System.out.println("--------------------------------");
    }
}


