import java.util.Scanner;
public class MultiplicacionSolicitadaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la tabla a multiplicar: ");
        int tabla = scanner.nextInt();
        
        
        //Ahora el programa no debe de admitir números negativos
        //Si loas hay, indicarlo en un mensaje y terminar el programa
        
        if(tabla < 0){
            System.out.println("No se aceptan números negativos");
            return;
        } else {
            System.out.println("Hasta que número te gustaría multiplicar?: ");
        int limite = scanner.nextInt();
         for(int i = 1; i<=limite; i++){
            System.out.println(tabla + " x " + i + " = " + tabla * i);
        }
        }
    }
}
