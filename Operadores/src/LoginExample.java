import java.util.Scanner;

public class LoginExample {
    public static void main(String[] args) {
        String username = "Eddard", pwd = "abc123";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario: ");
        String userLogin = scanner.next();
        System.out.println("Ingrese su nombre de usuario: ");
        String userPwd = scanner.next();

        if((username.equals(userLogin)) && (pwd.equals(userPwd))){ // Aqui no puedo emplear los operadores '==' po ser strings primitivos
            System.out.println("Bienvenido ".concat(username));
        }
        else{
            System.out.println("Usuario o contraseña incorrecta");
        }

    }
}
