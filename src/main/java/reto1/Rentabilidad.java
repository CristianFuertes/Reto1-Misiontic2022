package reto1;

public class Rentabilidad {

    //atributos
   private int tiempo;// tiempo en meses
   private double capital;// valor del capital
   private double interes;// tasa de interes 
    //constructores

     Rentabilidad(){
        tiempo = 0;
        capital = 0;
        interes = 0;
    }

    //metodos 

    public double calcularInteresSimple(){
        double interesSimple = capital*interes*tiempo;
        return interesSimple;
    }

    public double calcularInteresCompuesto(){
        double interesCompuesto = capital*(Math.pow((1+interes), tiempo)-1);
        return interesCompuesto;
    }

    public String compararInversion ( int pTiempo, double pCapital, double pInteres ){
        double respuesta;
        tiempo = pTiempo;
        capital = pCapital;
        interes = pInteres;
 /* Cálculo de la diferencia entre tipos de tasas */
        respuesta = calcularInteresCompuesto( ) - calcularInteresSimple( );
        respuesta = Math.round(respuesta);
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple,asciende a la cifra de: $"+respuesta;
    
 }


    
    
 
}
