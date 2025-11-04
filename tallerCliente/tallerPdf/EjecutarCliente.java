public class EjecutarCliente {
    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente1 = new Cliente("Juan", "12345678");

        // Crear fotos
        Foto f1 = new Foto("foto1.jpg");
        Foto f2 = new Foto("foto2.jpg");
        Foto[] fotos = { f1, f2 };

        // Crear productos
        Impresion impresion = new Impresion(1, "Color", fotos);
        Camara camara = new Camara(2, "Canon", "R10");
        Producto[] productos = { impresion, camara };

        // Crear pedido (ahora la fecha es un String)
        Pedido pedido1 = new Pedido(cliente1, productos, "03/11/2025", 12345678);

        // Mostrar información del pedido
        pedido1.mostrarPedido();

        // Probar método de impresión de fotos
        f1.print();
    }
}
