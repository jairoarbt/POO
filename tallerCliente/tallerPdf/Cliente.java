public class Cliente{

    private String cedula;
    private String nombre;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cedula=" + cedula + "}";
    }
}

    


