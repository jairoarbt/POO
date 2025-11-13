public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }

    @Override
    public void presionar() {
        super.presionar();
        System.out.println(" Botón interno seleccionado para el piso " + pisoDestino);
    }

    public int getPisoDestino() {
        return pisoDestino;
    }
}
