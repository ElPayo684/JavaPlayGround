import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int year = 0;

        System.out.println("Ingrese el año que quiere consultar: ");
        year = scanner.nextInt();

        if((year % 4 == 0) && (year % 100 != 0)){
            System.out.println("El año " + year + " es bisiesto!");
        }else if((year % 100 == 0) && (year % 400 == 0)){
            System.out.println("El año " + year + " es bisiesto!");   
        }else{
            System.out.println("El año "+ year + " no es bisiesto!");
        }
    }
}
