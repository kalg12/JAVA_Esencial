import java.util.Scanner;
public class BucleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número a multiplicar");
        int numeroMultiplicando = scanner.nextInt();
        
        for(int i=1; i <= 10; i++){
            System.out.println(i + " x " + numeroMultiplicando + " = " + numeroMultiplicando*i);
        }
    }
}
