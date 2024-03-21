import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mate = 0, ciencia = 0, historia = 0;

        System.out.println("Ingrese su calificacion de matematicas: ");
        mate = scanner.nextDouble();
        System.out.println("Ingrese su calificacion de ciencias: ");
        ciencia = scanner.nextDouble();
        System.out.println("Ingrese su calificacion de historia: ");
        historia = scanner.nextDouble();

        double promedio = (mate + historia + ciencia) / 3;
        String estado = promedio >= 7.0 ? "Aprobado" : "Reprobado";

        System.out.println("Su promedio es de " + promedio + " esta usted ".concat(estado));

        
        Integer num = 50;
        boolean b1 = num instanceof Object; // Para revisar su herencia
        System.out.println(b1);
    }

}
