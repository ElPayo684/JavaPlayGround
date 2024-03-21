public class ArgumentoReferencia {
    public static void main(String[] args) {
        int[] ages = { 10, 11, 15 };

        for(int i = 0; i < ages.length; i++){
            System.out.println("La edad " + i + " en main() es: " + ages[i]);
        }
        test(ages);
        for(int i = 0; i < ages.length; i++){ // Apunta al mismo puntero en la memoria, por lo que mantiene el cambio
            System.out.println("La edad " + i + " en main() es: " + ages[i]);
        }

    }

    public static void test(int[] agesArr) {

        for(int i = 0; i < agesArr.length; i++){
            agesArr[i]++;
            System.out.println("La edad " + i + " en test() es: " + agesArr[i]);
        }
    }
}
