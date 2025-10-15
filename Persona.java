public class Persona {

    // Atributos de la clase
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;
    private double altura;

    // Método Constructor de la Clase
    // El constructor de la clase permite inicializar la clase
    // El constructor de la una clase se reconoce porque tiene el mismo nombre de la
    // clase
    // El operador this es una autoreferencia al atributo de la clase
    public Persona(String nombre, String apellido, int edad, int cedula, double peso, double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;        
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;

    
    }

    //El método toString sirve para visualizar los objetos
    public String toString() {
        return "Persona [ Nombre: " + nombre + " Apellido: " + apellido +
                " Edad: " + edad + " Cédula: " + cedula + " Peso: " + peso + "altura " + altura + "]";
    }



                
    
    // Métodos nuevos

    
     
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public int getCedula() { return cedula; }
    public void setCedula(int cedula) { this.cedula = cedula; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    
    

    // Método saludar
    public String saludar() {
        return "Hola, mi nombre es " + nombre + " " + apellido;
    }

    // Método esMayorDeEdad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método calcularIMC
    public double calcularIMC() {
        return peso / (altura * altura);




    
        }

}