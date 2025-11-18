import java.util.Scanner;

public class ejecutarCuenta
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Entrada de datos");
        
        // Crear cuenta con datos ingresados por el usuario
        CuentaBancaria cuenta = crearCuenta(scanner);
        
        if (cuenta != null) {
            // Menú de operaciones
            realizarOperaciones(scanner, cuenta);
            
            // Mostrar estado final
            System.out.println("Estado final de la cuenta: ");
            System.out.println(cuenta.toString());
        }
        
        scanner.close();
    }
    
    // Método para crear una cuenta con datos ingresados
    public static CuentaBancaria crearCuenta(Scanner scanner) {
        try {
            System.out.println(" Creacion de cuenta ");
            
            // Solicitar titular
            System.out.print("Ingrese el nombre del titular: ");
            String titular = scanner.nextLine();
            
            // Solicitar número de cuenta
            System.out.print("Ingrese el número de cuenta (mínimo 6 dígitos): ");
            String numeroCuenta = scanner.nextLine();
            
            // Validar y crear cuenta
            CuentaBancaria cuenta = new CuentaBancaria(titular, numeroCuenta);
            System.out.println(" Cuenta creada exitosamente");
            System.out.println(cuenta.toString());
            
            return cuenta;
            
        } catch (IllegalArgumentException e) {
            System.out.println(" Error al crear la cuenta: " + e.getMessage());
            return null;
        }
    }
    
    // Método para realizar operaciones bancarias
    public static void realizarOperaciones(Scanner scanner, CuentaBancaria cuenta) {
        int opcion;
        
        do {
            System.out.println("Menu de operaciones");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Ver información de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");
            
            // Validar que la entrada sea un número
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
                System.out.print("Seleccione una opción (1-5): ");
            }
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    realizarDeposito(scanner, cuenta);
                    break;
                case 2:
                    realizarRetiro(scanner, cuenta);
                    break;
                case 3:
                    consultarSaldo(cuenta);
                    break;
                case 4:
                    System.out.println("\n" + cuenta.toString());
                    break;
                case 5:
                    System.out.println("Gracias por usar nuestro banco");
                    break;
                default:
                    System.out.println("Opción no válida por favor seleccione 1-5.");
            }
            
        } while (opcion != 5);
    }
    
    // Método para realizar depósito
    public static void realizarDeposito(Scanner scanner, CuentaBancaria cuenta) {
        System.out.print("\nIngrese el monto a depositar: ");
        
        // Validar que la entrada sea un número
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un monto válido.");
            scanner.next(); 
            System.out.print("Ingrese el monto a depositar: $");
        }
        
        double monto = scanner.nextDouble();
        scanner.nextLine();
        
        cuenta.depositar(monto);
    }
    
    // Método para realizar retiro
    public static void realizarRetiro(Scanner scanner, CuentaBancaria cuenta) {
        System.out.print("Ingrese el monto a retirar: $");
        
        // Validar que la entrada sea un número
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un monto valido.");
            scanner.next(); 
            System.out.print("Ingrese el monto a retirar: ");
        }
        
        double monto = scanner.nextDouble();
        scanner.nextLine(); 
        
        cuenta.retirar(monto);
    }
    
    // Método para consultar saldo
    public static void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Consulta saldo ");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo actual: $" + String.format("%.2f", cuenta.getSaldo()));
    }
}