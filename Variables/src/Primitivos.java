public class Primitivos {
    public static void main(String[] args) {
        //Variable Byte
        byte byteNumber = 127;
        System.out.println(byteNumber);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);
        
        // Short
        short shortNumber = 32767;
        System.out.println("\n" + shortNumber);
        System.out.println("Tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        // Int
        int intNumber = 2147483647;
        System.out.println("\n" + intNumber);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        // Long
        long longNumber = 9223372036854775807L; // No olvidar colocar la "L", sino lo registra como int y marca error
        System.out.println("\n" + longNumber);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

    }    
}
