public class Cuenta {
    
    private int numero;
    private double saldo;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", saldo=" + saldo + "}"; 
    } 

}