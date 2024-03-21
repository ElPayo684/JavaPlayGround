import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = 0;

        System.out.println("Ingrese el número del mes a consultar");
        month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("El mes " + month + " es Enero");
                break;
            case 2:
                System.out.println("El mes " + month + " es Febrero");
                break;
            case 3:
                System.out.println("El mes " + month + " es Marzo");
                break;
            case 4:
                System.out.println("El mes " + month + " es Abril");
                break;
            case 5:
                System.out.println("El mes " + month + " es Mayo");
                break;
            case 6:
                System.out.println("El mes " + month + " es Junio");
                break;
            case 7:
                System.out.println("El mes " + month + " es Julio");
                break;
            case 8:
                System.out.println("El mes " + month + " es Agosto");
                break;
            case 9:
                System.out.println("El mes " + month + " es Septiembre");
                break;
            case 10:
                System.out.println("El mes " + month + " es Octubre");
                break;
            case 11:
                System.out.println("El mes " + month + " es Noviembre");
                break;
            case 12:
                System.out.println("El mes " + month + " es Diciembre");
                break;
        
            default:
                System.out.println("Su número no pertenece a ningun mes");
                break;
        }
    }
}
