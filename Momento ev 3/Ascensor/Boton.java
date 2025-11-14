public class Boton {
    private String nombre;
    private boolean iluminado;

    public Boton() {}

    public Boton(String nombre) {
        this.nombre = nombre;
        this.iluminado = false;
    }

    
    public void presionar() {
        System.out.println("Se presionó el botón " + nombre);
    }

    public void encender() {
        iluminado = true;
        System.out.println("Botón esta " + nombre + " encendido.");
    }

    public void apagar() {
        iluminado = false;
        System.out.println("Botón esta " + nombre + " apagado.");
    }
}



