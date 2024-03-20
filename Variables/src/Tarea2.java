import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la descripción de la factura: ");
        String nombreFacturaString = scanner.nextLine();
        System.out.println("Ingrese el precio del articulo 1: ");
        Double articulo1 = scanner.nextDouble();
        System.out.println("Ingrese el precio del articulo 2: ");
        Double articulo2 = scanner.nextDouble();

        Double pagoBruto = articulo1 + articulo2;
        Double tax = pagoBruto * 0.19;

        System.out.println("La factura producto de " + nombreFacturaString + " tiene un total bruto de: " + pagoBruto + 
        ", con un impuesto de " + tax + ", quedando con el precio final de: " + (pagoBruto + tax));
    }
}
