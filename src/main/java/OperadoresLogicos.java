//Importaciones se hacen al nivel más alto
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //TAREA - EJERCICIO CON OPERADORES LOGICOS
        
        //Uso del objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        //Petición de valor al usuario
       //Declaraciones de variables        

        System.out.println("Ingresa el valor del dato uno:");
        int datoUno = scanner.nextInt();
        System.out.println("Ingresa el valor del dato dos");
        int datoDos = scanner.nextInt();

        
        
        /*
        if(datoUno > datoDos){
            System.out.println("El dato uno es mayor que el segundo");
        }else{
            System.out.println("El dato dos es mayor que el primero");
        }
        */
        
        if(datoUno  == datoDos){ //TRUE o FALSE
            System.out.println("Es igual");
        } else {
            System.out.println("Son diferentes");
        }
        
        
    }
}
