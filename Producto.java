public class Producto {
    // Atributos private
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    
    // Constructor por defecto
    public Producto() {
        this.codigo = "SIN-CODIGO";
        this.descripcion = "Sin descripción";
        this.cantidad = 1;
        this.precioUnitario = 0.0;
    }
    
    // Constructor parametrizado
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        // Validar código no vacío
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        
        // Validar descripción no vacía
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        
        // Validar cantidad mayor o igual a 1
        if (cantidad < 1) {
            throw new IllegalArgumentException("La cantidad debe ser mayor o igual a 1");
        }
        
        // Validar precio unitario mayor o igual a 0
        if (precioUnitario < 0) {
            throw new IllegalArgumentException("El precio unitario debe ser mayor o igual a 0");
        }
        
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    
    // Método calcularSubtotal
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }
    
    // Método aplicarDescuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 50) {
            double descuento = precioUnitario * (porcentaje / 100);
            precioUnitario -= descuento;
            System.out.println("Descuento aplicado: " + porcentaje + "%");
            System.out.println("Nuevo precio unitario: $" + String.format("%.2f", precioUnitario));
        } else {
            System.out.println("Error: El porcentaje de descuento debe estar entre 0 y 50");
        }
    }
    
    // Método incrementarCantidad
    public void incrementarCantidad(int valor) {
        if (valor > 0) {
            cantidad += valor;
            System.out.println("Cantidad incrementada en: " + valor);
            System.out.println("Nueva cantidad: " + cantidad);
        } else {
            System.out.println("Error: El valor a incrementar debe ser mayor a 0");
        }
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Producto:\n" +
               "Código: " + codigo + "\n" +
               "Descripción: " + descripcion + "\n" +
               "Cantidad: " + cantidad + "\n" +
               "Precio Unitario: $" + String.format("%.2f", precioUnitario) + "\n" +
               "Subtotal: $" + String.format("%.2f", calcularSubtotal());
    }
    
    // Getters
    public String getCodigo() {
        return codigo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
