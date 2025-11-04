public class Producto {
    protected int numero;

    public Producto() {
        this.numero = 0;
    }

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Producto [Número: " + numero + "]";
    }
}

// Subclase Impresion
class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public String getColor() {
        return color;
    }

    public Foto[] getFotos() {
        return fotos;
    }

    @Override
    public String toString() {
        return "Impresión [Número: " + numero + ", Color: " + color + "]";
    }
}

// Subclase Camara
class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Cámara [Número: " + numero + ", Marca: " + marca + ", Modelo: " + modelo + "]";
    }
}
 