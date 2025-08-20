public class Tallerclase{



public static void main (String []args){
    
    
   

  
    //punto 1
    System.out.println("------------------------");
    System.out.println("Punto numero 1");
    double d1 , d2 , d3 , t1 , t2 , t3 , l1 , l2 , l3;
    
    double 
        precioLitro = 1.35f,
        masaCargaKg = 1200f,
        largo = 2.0f,
        ancho = 1.2f,
        alto = 1.1f,
        p1 = 2.5f,
        p2 = 3.0f,
        p3 = 2.0f,
        deprecPorKm = 0.08f,
        volCamionM3 = 10.0f,
        fCO2 = 2.68f,
        galPorLitro = 0.264172f,
        vmin = 30f,
        vmax = 90f,
        va = 40f,
        vb = 80f,
        ca = 0.05f,
        cb = 0.09f,
        a = -0.0008f,
        b = 0.08f, 
        c = 4.0f;
        
    d1 = 42.0;
    d2 = 58.5;
    d3 = 37.2;
    t1 = 0.9;
    t2 = 1.4;
    t3 = 0.8;
    l1 = 5.1;
    l2 = 6.9;
    l3 = 4.3;
    
    System.out.println("precioLitro = " + precioLitro);
    System.out.println("masaCargaKg = " + masaCargaKg);
    System.out.println("largo = " + largo);
    System.out.println("ancho = " + ancho);
    System.out.println("alto = " + alto);
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);
    System.out.println("p3 = " + p3);
    System.out.println("deprecPorKm = " + deprecPorKm);
    System.out.println("volCamionM3 = " + volCamionM3);
    System.out.println("fCO2 = " + fCO2);
    System.out.println("galPorLitro = " + galPorLitro);
    System.out.println("vmin = " + vmin);
    System.out.println("vmax = " + vmax);
    System.out.println("va = " + va);
    System.out.println("vb = " + vb);
    System.out.println("ca = " + ca);
    System.out.println("cb = " + cb);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    System.out.println("d1 ="+ d1);
    System.out.println( "d2 =" + d2);
    System.out.println( "d3 =" + d3);
    System.out.println( "t1 =" + t1);
    System.out.println( "t2 =" + t2); 
    System.out.println( "t3 =" + t3);
    System.out.println( "l1 =" + l1);
    System.out.println( "l2 =" + l2);
    System.out.println( "l3 =" + l3);

     // Punto 2
     System.out.println("-------------------------");
     System.out.println("Punto numero 2");

     double v1 = d1 / t1;
     double v2 = d2 / t2;
     double v3 = d3 / t3;
     double vProm = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);

     double kml1 = d1 / l1;
     double kml2 = d2 / l2;
     double kml3 = d3 / l3;
     double kmTotal = (d1 + d2 + d3) / (l1 + l2 + l3); 
     System.out.println("Velocidades");
     System.out.println("v1 =" + v1);
     System.out.println("v2 =" + v2);
     System.out.println("v3 =" + v3);
     System.out.println("vProm =" + vProm);

     System.out.println("Rendimientos");
     System.out.println("Kml 1 =" + kml1);
     System.out.println("Kml 2 =" + kml2);
     System.out.println("Kml 3 =" + kml3);
     System.out.println("Kml Total =" + kmTotal);


     //Punto 3
     System.out.println("------------------------");
     System.out.println("Punto numero 3");

     double costoComb = (l1 + l2 + l3) * precioLitro;
     double depre = (d1 + d2 + d3) * deprecPorKm;
     double peajes = p1 + p2 + p3;
     double costoDirecto = costoComb + depre + peajes; 
     double costoPorKm = costoDirecto / (d1 + d2 +d3);


     System.out.println("costoComb = " + costoComb);
     System.out.println("depre = " + depre);
     System.out.println("peajes = " + peajes);
     System.out.println("costoDirecto = " + costoDirecto);
     System.out.println("costoPorKm = " + costoPorKm);

     //punto 4
     System.out.println("------------------------");
     System.out.println("Punto numero 4");
     
     double volumenM3 = largo * ancho * alto;
     double densidad = masaCargaKg / volumenM3;
     double ocupacion = volumenM3  / volCamionM3;

     System.out.println("volumenM3 = " + volumenM3);
     System.out.println("densidad =" + densidad);
     System.out.println("ocupacion =" + ocupacion);

     //Punto 5
      System.out.println("------------------------");
      System.out.println("Punto numero 5");

       double  co2Total = (l1 +l2 + l3) * fCO2;
       double co2PorKm = co2Total / (d1 + d2 + d3);
       System.out.println("co2Total = " + co2Total);
       System.out.println("co2PorKm = " + co2PorKm);

    //Punto 6
    System.out.println("------------------------");
    System.out.println("Punto numero 6");
    double vMsProm = vProm * 1000 / 3600;
    double GalTot = (l1 +l2 + l3) * galPorLitro;
    double vNorm = (vProm - vmin) / (vmax - vmin);
    System.out.println("vMsProm =" + vMsProm);
    System.out.println("GalTot =" + GalTot);
    System.out.println("vNorm =" + vNorm);


    //Punto 7
    System.out.println("------------------------");
    System.out.println("Punto numero 7");
    double vmedia = (v1 + v2 + v3) / 3;
    double sigma = Math.sqrt((Math.pow(v1 - vmedia , 2) + Math.pow(v2 - vmedia , 2) + Math.pow(v3 - vmedia , 2)) / 3) ;
    double vPondt = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);
    System.out.println("Sigma (ó) = " + sigma);
    System.out.println("vPond_t = " + vPondt);


    //Punto 8
    System.out.println("------------------------");
    System.out.println("Punto numero 8");
    double cvProm = ca + (cb - ca) * (vProm - va) / (vb - va);
    double costoMant = cvProm * (d1 + d2 + d3);
    System.out.println("c(vProm) = " + cvProm);
    System.out.println("costoMant =" + costoMant);


    //Punto 9
    System.out.println("------------------------");
    System.out.println("Punto numero 9");
    double kmlModelo = a * Math.pow(vProm, 2) + b * vProm + c;
    double litrosModelo = (d1 + d2 + d3) / kmlModelo;
     System.out.println("kmlModelo =" + kmlModelo);
     System.out.println("litrosModelo =" + litrosModelo);

    
     //Punto 10 
     System.out.println("------------------------");
     System.out.println("Punto numero 10");
     System.out.println(" w1 + w2 + w3 + w4 = 1");
     double w1 = 0.25f , w2 = 0.25f , w3 = 0.25f , w4 = 0.25f; 
     double score = w1 * 1 / costoPorKm + w2 * kmTotal + w3 * 1 / co2PorKm + w4 * 1 / (1 + sigma);
     System.out.println("Score = " + score);
     




   

















     


} 
    
}