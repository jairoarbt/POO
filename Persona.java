public class Persona {

    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;

    // Método Constructor de la Clase
    // El constructor de la clase permite inicializar la clase
    // El constructor de la una clase se reconoce porque tiene el mismo nombre de la
    // clase
    // El operador this es una autoreferencia al atributo de la clase
    public Persona(String nombre, String apellido, int edad, int cedula, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
    }

    //El método toString sirve para visualizar los objetos
    public String toString() {
        return "Persona [ Nombre: " + nombre + " Apellido: " + apellido +
                " Edad: " + edad + " Cédula: " + cedula + " Peso: " + peso + "]";
    }

}