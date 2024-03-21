import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su primer numero: ");
        Integer x = scanner.nextInt();
        System.out.println("Ingrese su segundo numero: ");
        Integer y = scanner.nextInt();

        String order = x > y ? "El número ".concat(x.toString(x)).concat(" es mayor a ").concat(y.toString(y))  : 
        "El número ".concat(y.toString(y)).concat(" es mayor a ").concat(x.toString(x));

        System.out.println(order);
    }
}
