import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la capacidad del tanque (de 1 a 70): ");
        double userAnswer = scanner.nextDouble();

        String answer = (userAnswer == 70) ? "Tanque lleno" : (userAnswer >= 60) ? "Estanque casi lleno" : (userAnswer >= 40) ? 
        "Estanque 3/4" : (userAnswer >= 35) ? "Medio estanque" : (userAnswer >= 20) ? "Suficiente" : "Insuficiente";

        System.out.println("Información del tanque: ".concat(answer));
    }
}
