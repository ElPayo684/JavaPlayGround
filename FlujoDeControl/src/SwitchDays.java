import java.util.Scanner;

public class SwitchDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = 0, year = 0, days = 0;

        System.out.println("Ingrese el año que quiere consultar: ");
        year = scanner.nextInt();

        System.out.println("Ingrese el número del mes a consultar");
        month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if((year % 4 == 0) && (year % 100 != 0)){
                    days = 29;
                }else if((year % 100 == 0) && (year % 400 == 0)){
                    days = 29;   
                }else{
                    days = 28;
                }
                break;
            default:
                days = 0;
                break;
        }
        String mesage = "Numero de días: ".concat(Integer.toString(days));
        System.out.println(mesage);
    }
}
