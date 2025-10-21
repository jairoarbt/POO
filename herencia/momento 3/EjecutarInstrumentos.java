// Clase principal o ejecutora

public class EjecutarInstrumentos {
    public static void main(String[] args) {
        // Crear objetos de la clase Guitarra
        Guitarra g1 = new Guitarra("Guitarra Española", "Cuerda", "Madera", 6, false);
        Guitarra g2 = new Guitarra("Guitarra Eléctrica", "Cuerda", "Metal y madera", 6, true);

        // Mostrar información general
        System.out.println("=== INFORMACIÓN DE LOS INSTRUMENTOS ===");
        g1.mostrarGuitarra();
        g2.mostrarGuitarra();

        // Ejecutar métodos heredados y sobrescritos
        System.out.println("=== ACCIONES ===");
        g1.afinar();
        g1.tocar();
        g1.rasguear();

        System.out.println();

        g2.afinar();
        g2.tocar();
        g2.rasguear();

        System.out.println("\n=== FIN DE LA EJECUCIÓN ===");
    }
}
