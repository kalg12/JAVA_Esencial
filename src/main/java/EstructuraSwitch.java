import java.util.Scanner;
public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca el día de la semana que quiere su cita:");
        String dia = scanner.nextLine();
        
        switch (dia) {
            case "lunes":
            case "martes":
                System.out.println("Puede venir en un horario de 15:30 a 17:30");
                break;
            case "miercoles": 
                System.out.println("Puede venir en un horario de 11:00 a 12:30");
                break;
            case "jueves":
                System.out.println("Puede venir en un horario de 15:30 a 17:30");
                break;
            case "viernes": 
                System.out.println("Puede venir en un horario de 09:00 a 11:00");
                break;
            case "sabado":
                System.out.println("Puede venir en un horario de 15:30 a 17:30");
            case "domingo": 
                System.out.println("El domingo la clínica permanece cerrada");
                break;
            default:
                System.out.println("Usted no ha introducido un día válido");
        }
    }
}
