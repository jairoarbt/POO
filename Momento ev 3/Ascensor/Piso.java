public class Piso {
    private int numero;
    private Boton botonLlamada;
    
    public Piso(int numero) {
        this.numero = numero;
        this.botonLlamada = new Boton("Llamar ascensor");
    }
    //Metodo para presionar el boton de llamada de piso
    public void presionarBotonLlamada(Ascensor ascensor) {
        botonLlamada.encender();
        System.out.println("Llamando al ascensor desde el piso " + numero);
        ascensor.irAPiso(numero); 
        botonLlamada.apagar();
    }
}
