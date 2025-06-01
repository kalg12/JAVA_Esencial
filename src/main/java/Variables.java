import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        int numeroUno = 50; //variable de tipo número entero
        String palabra = "Kevin"; //variable de tipo cadena de texto
        char letra = 'a'; //variable de tipo letra
        double decimal = 3.14; //variable de tipo decimal
        boolean isActive = true; // varialbe de tipo booleano
        //----------//
        String miNombre = "Kevin";
        String miApellido = "Luciano";
        
        System.out.println(numeroUno);
        System.out.println(palabra);
        System.out.println(letra);
        System.out.println(decimal);
        System.out.println(isActive);
        
        //-----CONCATENACION-----//
        System.out.println(miNombre + " " + miApellido);
        System.out.println("Mi nombre es: " + miNombre + " " + miApellido);
        
        //Para usar el teclado debo utilizar Scanner
        //Crear un objeto Scanner para leer la entrada de un usuario
        Scanner entradaDeTexto = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edadDeUsuario = entradaDeTexto.nextInt();
        System.out.println("La edad introducida es: " + edadDeUsuario);
    }
    
}