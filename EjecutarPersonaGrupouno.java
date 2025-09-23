public class EjecutarPersonaGrupouno {
    public static void main(String[] args) {
        
        //Forma1
        //Creación del objeto objPersona1
        Persona objPersona1;
        //Instanciar el objeto (new) --> Instanciar es igual a crear (Darle vida al objeto)
        objPersona1 = new Persona("Camilo", "Cifuentes", 22, 1120345, 68.4, 1.70);

        //Forma2
        Persona objPersona2 = new Persona("Byron", "Cano", 35, 1001980, 60.0, 1.60);

        //Mostrar por pantalla el objeto creado
        System.out.println(objPersona1.toString());

        System.out.println(objPersona2.toString());

        System.out.println("\n--- Métodos nuevos ---");

        // Saludar
        System.out.println(objPersona1.saludar());
        System.out.println(objPersona2.saludar());

        // Mayor de edad
        System.out.println(objPersona1.getNombre() + " es mayor de edad? " + objPersona1.esMayorDeEdad());
        System.out.println(objPersona2.getNombre() + " es mayor de edad? " + objPersona2.esMayorDeEdad());

        // IMC
        System.out.println(objPersona1.getNombre() + " tiene un IMC de: " + objPersona1.calcularIMC());
        System.out.println(objPersona2.getNombre() + " tiene un IMC de: " + objPersona2.calcularIMC());
        
    }
}
       