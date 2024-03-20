public class Caracteres {
    public static void main(String[] args) {
        char caracter = 'H';
        System.out.println(caracter);
        caracter = '\u0040'; // unicode "@"
        System.out.println(caracter);
        caracter = 12; // unicode por valor
        System.out.println(caracter);

        System.out.println("Char corresponde en byte a: " + Character.BYTES);
        System.out.println("Char corresponde en bites a: " + Character.SIZE);
    }
}
