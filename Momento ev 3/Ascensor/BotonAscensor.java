public class BotonAscensor extends Boton {
    private int pisoDestino;
    
    public BotonAscensor(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }
    //Metodo para presionar boton del ascensor
    @Override
    public void presionar() {
        
        super.presionar();
            System.out.println(" Botón seleccionado para el piso " + pisoDestino); 
    }
    public int getPisoDestino() {
        return pisoDestino;
    }
}
