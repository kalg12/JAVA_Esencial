import java.math.BigDecimal;
import java.util.Scanner;

public class ConversorDeMonedas {
    public static void main(String[] args) {
        /* 
        Programa que pide por pantalla introducir en pesos MXN y devuelve la conversión en dólares
        americanos.
        
        El mensaje será de salida: *** pesos mxn equivalen a **** dólares americanos.
        */
        
        double pesosMexicanos, dolaresAmericanos;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bienvenido, por favor ingrese los pesos MXN a convertir a USD: ");
        pesosMexicanos = scanner.nextDouble();
        
        dolaresAmericanos = pesosMexicanos * 17.02;
        
        System.out.println(pesosMexicanos + " pesos mxn equivalen a " + dolaresAmericanos);
        
        //Para ser exactos debemos de usar una clase llamada BigDecimal
        String pesosMexicanosNew = Double.toString(pesosMexicanos);
        BigDecimal pesosMexicanosBigDecimal = new BigDecimal(pesosMexicanosNew);
        
        double tasaDeCambio = 17.02;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal (tasaDeCambioString);
        
        //Haremos uso de multiply
        BigDecimal dolaresBigDecimal = pesosMexicanosBigDecimal.multiply(tasaDeCambioBigDecimal);
        
        System.out.println( pesosMexicanos + " pesos mxn equivalen a " + dolaresBigDecimal.toString() + " usd doláres");
    }
}
