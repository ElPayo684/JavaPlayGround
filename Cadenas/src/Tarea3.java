import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Ingrese el primer nombre: ");
        String name1 = scanner.nextLine();
        char[] name1Char = name1.toCharArray();
        System.out.println("Ingrese el segundo nombre: ");
        String name2 = scanner.nextLine();
        char[] name2Char = name2.toCharArray();
        System.out.println("Ingrese el tercer nombre: ");
        String name3 = scanner.nextLine();
        char[] name3Char = name3.toCharArray();

        System.out.println(name1Char[1] + "." + name1.substring(name1.length()-2, name1.length()) + "_" + 
        name2Char[1] + "." + name2.substring(name2.length()-2, name2.length()) + "_" +
        name3Char[1] + "." + name3.substring(name3.length()-2, name3.length()));

    }
}
