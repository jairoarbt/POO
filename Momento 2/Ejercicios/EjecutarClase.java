import java.util.Scanner;

public class EjecutarClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Sistema de Gestion de Productos");
        
        // Crear producto con datos ingresados
        Producto producto = crearProducto(scanner);
        
        if (producto != null) {
            // Menu de operaciones
            realizarOperaciones(scanner, producto);
            
            // Mostrar estado final
            System.out.println("informacion finl producto");
            System.out.println(producto.toString());
        }
        
        scanner.close();
    }
    
    // Metodo para crear un producto con datos ingresados
    public static Producto crearProducto(Scanner scanner) {
        try {
            System.out.println("Registro de nuevo producto");
            
            // Solicitar código
            System.out.print("Ingrese el código del producto: ");
            String codigo = scanner.nextLine();
            
            // Solicitar descripción
            System.out.print("Ingrese la descripción del producto: ");
            String descripcion = scanner.nextLine();
            
            // Solicitar cantidad
            System.out.print("Ingrese la cantidad (mínimo 1): ");
            int cantidad = obtenerEnteroPositivo(scanner, 1);
            
            // Solicitar precio unitario
            System.out.print("Ingrese el precio unitario (mínimo 0): ");
            double precioUnitario = obtenerDoublePositivo(scanner, 0);
            
            // Validar y crear producto
            Producto producto = new Producto(codigo, descripcion, cantidad, precioUnitario);
            System.out.println(" Producto registrado exitosamente!");
            System.out.println(producto.toString());
            
            return producto;
            
        } catch (IllegalArgumentException e) {
            System.out.println(" Error al crear el producto: " + e.getMessage());
            return null;
        }
    }
    
    // Metodo para realizar operaciones con el producto
    public static void realizarOperaciones(Scanner scanner, Producto producto) {
        int opcion;
        
        do {
            System.out.println("Menu de operaciones");
            System.out.println("1. Calcular subtotal");
            System.out.println("2. Aplicar descuento");
            System.out.println("3. Incrementar cantidad");
            System.out.println("4. Ver información del producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");
            
            opcion = obtenerEnteroPositivo(scanner, 1);
            
            switch (opcion) {
                case 1:
                    calcularSubtotal(producto);
                    break;
                case 2:
                    aplicarDescuentoProducto(scanner, producto);
                    break;
                case 3:
                    incrementarCantidadProducto(scanner, producto);
                    break;
                case 4:
                    System.out.println("\n" + producto.toString());
                    break;
                case 5:
                    System.out.println("¡Gracias por usar el sistema de gestión de productos!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione 1-5.");
            }
            
        } while (opcion != 5);
    }
    
    // Metodo para calcular subtotal
    public static void calcularSubtotal(Producto producto) {
        System.out.println("Subtotal");
        double subtotal = producto.calcularSubtotal();
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("(Cantidad: " + producto.getCantidad() + " × Precio: $" + 
                          String.format("%.2f", producto.getPrecioUnitario()) + ")");
    }
    
    // Método para aplicar descuento
    public static void aplicarDescuentoProducto(Scanner scanner, Producto producto) {
        System.out.println("Aplicar descuento");
        System.out.print("Ingrese el porcentaje de descuento (0-50%): ");
        double porcentaje = obtenerDoublePositivo(scanner, 0);
        
        producto.aplicarDescuento(porcentaje);
    }
    
    // Método para incrementar cantidad
    public static void incrementarCantidadProducto(Scanner scanner, Producto producto) {
        System.out.println("Incrementar cantidad");
        System.out.print("Ingrese la cantidad a incrementar (mayor a 0): ");
        int incremento = obtenerEnteroPositivo(scanner, 1);
        
        producto.incrementarCantidad(incremento);
    }
    
    // Métodos auxiliares para validación de inputs
    public static int obtenerEnteroPositivo(Scanner scanner, int minimo) {
        int valor;
        while (true) {
            if (scanner.hasNextInt()) {
                valor = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                if (valor >= minimo) {
                    return valor;
                } else {
                    System.out.print("Error: El valor debe ser mayor o igual a " + minimo + ". Intente nuevamente: ");
                }
            } else {
                System.out.print("Error: Ingrese un número entero válido: ");
                scanner.next(); // Limpiar entrada inválida
            }
        }
    }
    
    public static double obtenerDoublePositivo(Scanner scanner, double minimo) {
        double valor;
        while (true) {
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer
                if (valor >= minimo) {
                    return valor;
                } else {
                    System.out.print("Error: El valor debe ser mayor o igual a " + minimo + ". Intente nuevamente: ");
                }
            } else {
                System.out.print("Error: Ingrese un número válido: ");
                scanner.next(); // Limpiar entrada inválida
            }
        }
    }
}
   
