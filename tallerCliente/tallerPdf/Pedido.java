public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private String fecha; 
    private int numeroTarjetaCredito;

    // Constructor
    public Pedido(Cliente cliente, Producto[] productos, String fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    // Mostrar información del pedido
    public void mostrarPedido() {
        System.out.println("Pedido");
        System.out.println(cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta de crédito: " + numeroTarjetaCredito);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println(" - " + p);
        }
    }
}

    
