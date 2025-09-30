public class EjecutarOpeMat {

    public static void main(String[] args) {
        
        //crear objeto 
        OperacionesMatematicas objOpe = new OperacionesMatematicas(5 , 6);

        

        //acceder el objeto
        
        System.out.println("la suma es " + objOpe.sumar());

        //acceder al metodo restar
         System.out.println("la resta es " + objOpe.restar());
         //acceder al metodo dividir

         System.out.println("la dvision es: " + objOpe.dividir());
         //acceder al metodo multplicacion

         System.out.println("la multicacion es: " + objOpe.multiplicar());







    }

    
}