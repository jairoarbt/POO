public class BotonPiso extends Boton {
    private String direccion;

    public BotonPiso(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void presionar() {
        super.presionar();
        System.out.println(" Botón de piso para " + direccion + " activado.");
    }
}
