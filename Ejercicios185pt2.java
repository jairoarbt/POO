public class Ejercicios185pt2 {


    
    public static void main(String[] args) {


        System.out.println("Punto 4.2");
        //punto 4.2

        float num1 = 5;
        float num2 = 7;


        if (num1 > num2){
            System.out.println("El numero " + num1 + " es el mayor");
        }
        else if (num1 < num2){
            System.out.println("El numero " + num2 + " es el mayor");
        }

        else{
            System.out.println("Los dos numeros ingresados son iguales");
        }


    System.out.println("------------------------------------------");
    
    
    //punto4.3
    System.out.println("Punto 4.3");

    int a = 2, b = 4, c = 3;
        int numcentral;
         System.out.println("Los numeros son: " + a  + b  + c);

        
    if ((a > b && a < c) || (a < b && a > c)) {
            numcentral = a;

    } else if ((b > a && b < c) || (b < a && b > c)) {
            numcentral = b;
    } 
    else {
        numcentral = c;
    }

        
        System.out.println("El número central es: " + numcentral);


    

    System.out.println("------------------------------------------");

    //punto 4.4

    System.out.println("Punto numero 4.4");


    int raiz = 4;

    if (raiz > 0 ){
        double resultadoRaiz = Math.sqrt(raiz);
        System.out.println("La raiz del numero " + raiz + " Es: " + resultadoRaiz);
    }

    else{
        System.out.println("No se puede hayar la raiz de un numero negativo");
    }

     System.out.println("------------------------------------------");


     //punto 4.5
     System.out.println("Punto numero 4.5");

     int numpar = 7; 

        System.out.println("Numero sera: " + numpar);
 
        if (numpar % 2 == 0) {
            System.out.println("El número " + numpar +" es par.");
        } else {
            System.out.println("El número " + numpar + " es impar.");
        }

        
        System.out.println("------------------------------------------");

        //punto 4.6

        System.out.println("Punto numero 4.6");

        int dia = 27;
        int mes = 3;
        int anno = 2025; 

        System.out.println("Fecha : " + dia + "/" + mes + "/" + anno);

        // Dia max de cada mes
        int diasMes = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                // año bisisesto
                if ((anno % 400 == 0) || (anno % 4 == 0 && anno % 100 != 0)) {
                    diasMes = 29; // 
                } else {
                    diasMes = 28;
                }
                break;
        }

        
        dia++;

        if (dia > diasMes) {
            dia = 1;
            mes++;
           if (mes > 12) {
                mes = 1;
                anno++;
            }
        }
        System.out.println("La fecha siguiente sera: " + dia + "/" + mes + "/" + anno);


        System.out.println("------------------------------------------");

        //punto 4.7
        System.out.println("Punto numero 4.7");
        
        
        int peso = 60;

        System.out.println("Peso del alumno: " + peso + " kg");

        if (peso < 40) {
            System.out.println(" Alumnos esta en la categoria de menos de 40 kg.");

        } else if (peso >= 40 && peso < 50) {
            System.out.println("Alumnos esta en la categoria entre 40 y 50 kg.");

        } else if (peso >= 50 && peso < 60) {
            System.out.println("Alumnos esta en la categoria entre 50 y menos de 60 kg.");

        } 
        else {
            System.out.println("Alumnos esta dentro de la categoria de 60 kg o más.");
        }

        System.out.println("------------------------------------------");

        //punto 4.8
        System.out.println("Punto numero 4.8");

        int nume1 = 10;
        int nume2 = 5;

        System.out.println("Número 1: " + nume1);
        System.out.println("Número 2: " + nume2);

        
        if (nume2 != 0 && nume1 % nume2 == 0) {
            System.out.println(nume2 + " es divisor de " + nume1);
        } 
        
        else if (nume1 != 0 && nume2 % nume1 == 0) {
            System.out.println(nume1 + " es divisor de " + nume2);
        } 
        else {
            System.out.println("Ninguno de los números es divisor del otro");

        }


        System.out.println("------------------------------------------");
        //punto 4.9

        System.out.println("Punto numero 4.9");

        int angulo = 120;

        System.out.println("Angulo es: " + angulo + " grados");

        if (angulo < 90) {
            System.out.println("El angulo es agudo.");

        } else if (angulo == 90) {
            System.out.println("El angulo es recto.");

        } else if (angulo > 90 && angulo < 180) {
            System.out.println("El angulo es obtuso.");

        } else if (angulo == 180) {
            System.out.println("El angulo es llano.");

        } else if (angulo > 180 && angulo < 360) {
            System.out.println("El angulo es cóncavo (o reflex).");

        } else if (angulo == 360) {
            System.out.println("El angulo es completo.");

        } 
        else {
            System.out.println("El angulo no es válido.");
        }


        System.out.println("------------------------------------------");
       
        //punto 4.10
        System.out.println("Punto numero 4.10");

        int calificacion = 80;   // 
        char grado;

        if (calificacion >= 90) {
            grado = 'A';

        } else if (calificacion >= 80) {
            grado = 'B';

        } else if (calificacion >= 70) {
            grado = 'C';

        } else if (calificacion >= 69) {
            grado = 'D';

        } 
        else {
            grado = 'F';
        }


        System.out.println("Calificacion es: " + calificacion);
        System.out.println("Es equivalente en letra a : " + grado);

        System.out.println("------------------------------------------");
       
        //punto 4.11
        System.out.println("Punto numero 4.11");
        
        
        int numer1 = 12;
        int numer2 = 4;
        int seleccionOp = 2; // 1 = suma, 2 = resta, 3 = multiplicación, 4 = división

        int resultado = 0;

        if (seleccionOp == 1) {
            resultado = numer1 + numer2;

            System.out.println("La suma es: " + resultado);

        } else if (seleccionOp == 2) {
            resultado = numer1 - numer2;

            System.out.println("La resta es: " + resultado);
        } else if (seleccionOp == 3) {
            resultado = numer1 * numer2;

            System.out.println("La multiplicación es: " + resultado);
        } else if (seleccionOp == 4) {

            if (num2 != 0) {
                resultado = numer1 / numer2;

                System.out.println("La división es: " + resultado);

            } else {
                System.out.println("Error: No se puede dividir entre 0");
            }
        } else {
            System.out.println("Código de operación inválido");
        }





        
    
    
    

    



 }

}