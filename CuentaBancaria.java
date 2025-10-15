public class CuentaBancaria {
    // Atributos private
    private String titular;
    private String numeroCuenta;
    private double saldo;
    
    // Constructor por defecto
    public CuentaBancaria() {
        this.titular = "Sin titular";
        this.numeroCuenta = "000000";
        this.saldo = 0.0;
    }
    
    // Constructor parametrizado
    public CuentaBancaria(String titular, String numeroCuenta) {
        // Validar titular no vacío
        if (titular == null || titular.trim().isEmpty()) {
            if (titular == null || titular.trim().isEmpty()) {
    System.out.println("Error: El titular no puede estar vacío. Se usará 'Sin titular'");
    this.titular = "Sin titular";
} else {
    this.titular = titular;
}
        }
        
        // Validar número de cuenta con al menos 6 dígitos
         if (numeroCuenta == null || numeroCuenta.length() < 6) {
            System.out.println("Error: El número de cuenta debe tener al menos 6 dígitos. Se usará '000000'");
            this.numeroCuenta = "000000";
        } else {
            this.numeroCuenta = numeroCuenta;
        } 
        
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicia siempre en 0
    }
    
    // Método depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso: " + monto);
        } else {
            System.out.println("Error: El monto a depositar debe ser mayor a 0");
        }
    }
    
    // Método retirar
    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
                System.out.println("Retiro exitoso: " + monto);
            } else {
                System.out.println("Error: Saldo insuficiente. Saldo actual: " + saldo);
            }
        } else {
            System.out.println("Error: El monto a retirar debe ser mayor a 0");
        }
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Cuenta Bancaria:" +
               "Titular: " + titular +  
               "Número de Cuenta: " + numeroCuenta  +
               "Saldo: $" + String.format("%.2f", saldo);
    }
    
    // Getters
    public String getTitular() {
        return titular;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
}
    

