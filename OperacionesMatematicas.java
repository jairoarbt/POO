

public class OperacionesMatematicas {

    //Atributos

    private int a;
    private int b;

    //Constructor permite inicializar la clase
    public OperacionesMatematicas (int a , int b){

        this.a = a;
        this.b = b;
    }



    //metodos
    public int sumar(){
        return a + b;

    }
    public int restar(){
        return a - b;


    }
    public double dividir(){
        double resultado;
        if ( b == 0){
        resultado = 0;
        }else{
        //(double) significa hacer una converion de entero a real
        resultado = (double) a / (double) b;
        }
        
        return resultado;
    }
    
    public int multiplicar(){
        return a * b;
    



    }

    
    }


    

    
}