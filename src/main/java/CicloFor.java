import java.util.Scanner;
public class CicloFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de holas que quiere ver en pantalla");
        int numeroElegido = scanner.nextInt();
        
        /*
        for(int i=1; i<=numeroElegido; i++ ){
            System.out.println("Hola");
        }
        */
        
        do {            
            System.out.println("Hola");
        } while (numeroElegido == 3);
        
    }
}
