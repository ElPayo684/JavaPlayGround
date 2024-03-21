public class ArgumentoValor {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("El valor de i al iniciar el programa desde main() es: " + i);
        test(i);
        System.out.println("El valor de i al finalizar el programa desde main() es: " + i);

    }
    public static void test(int i){

        System.out.println("El valor de i al iniciar el programa desde test() es: " + i);
        i = 15;
        System.out.println("El valor de i al finalizar el programa desde test() es: " + i);
    }
}
