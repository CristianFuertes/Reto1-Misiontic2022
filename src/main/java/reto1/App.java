package reto1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rentabilidad prueba1 = new Rentabilidad();
        System.out.println( prueba1.compararInversion(15, 500000, 0.025) );
        Rentabilidad prueba2 = new Rentabilidad();
        System.out.println( prueba2.compararInversion(3, 10000, 0.06) );
    }
}
