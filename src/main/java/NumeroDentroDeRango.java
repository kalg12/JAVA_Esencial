//Importamos Scanner
import java.util.Scanner;

public class NumeroDentroDeRango {
    public static void main(String[] args) {
        //PEDIR AL USUARIO UN NÚMERO DEL 1 AL 100, SI EL NUMERO NO CORRESPONDE AL RANGO SOLICITIADO
        //SE LE VA INDICAR AL USUARIO MEDIANTE MENSJAE  Y EL PROGRAMA FINALIZA.
        //SI EL VALOR CORRESPONDE DENTRO DEL RANGO, INDICAR QUE EL NÚMERO INGRESADO SI FORMA PARTE DEL RANGO
        //E INDICAR SI ES NÚMERO PAR O IMPAR
        
        //1.- VAMOS A INSTANCIAR SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //2- Preguntamos al usuario por algún número del 1 al 100
        System.out.println("Ingresa un valor del 1 al 100");
        //3.- Asignamos el valor ingresado a una variable
        int numeroIngresado = scanner.nextInt();
        
        if(numeroIngresado >= 1 & numeroIngresado <= 100){
            //Si se cumple la condición de arriba, mostrar en pantalla que está en el rango y si es numero par o no
            System.out.println("El número ingresado está dentro del rango 1 a 100");
            //Declaramos una variable para determinar el número par o impar
            int residuo = numeroIngresado % 2;
            
            if(residuo == 0){
                System.out.println("El número también es par");
            } else {
                System.out.println("El número es impar");
            }
        } else {
            System.out.println("El número que ingresaste np está dentro del rango de 1 al 100");
        }
        
    }
}
