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
        encender();
    }

    public void encender() {
        if (!iluminado) {
            iluminado = true;
            System.out.println("Botón " + nombre + " encendido.");
        }
    }

    public void apagar() {
        if (iluminado) {
            iluminado = false;
            System.out.println("Botón " + nombre + " apagado.");
        }
    }

    public boolean isIluminado() {
        return iluminado;
    }
}




