public class BotonPiso extends Boton {
    private String direccion;
    //Constructor para boton de piso
    public BotonPiso(String direccion) {
        this.direccion = direccion;
    }
    //Metodo para presionar boton de piso
    @Override
    public void presionar() {
        super.presionar();
        System.out.println(" Botón de piso para " + direccion + " activado.");
    }
}
