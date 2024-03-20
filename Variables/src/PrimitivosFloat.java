public class PrimitivosFloat {
    public static void main(String[] args) {
        //Float
        float realFloat = 1.1f; // No olvidar la f
        System.out.println("Float: " + realFloat);
        realFloat = 2.12e3f; // "e" es para la notacion cientifica
        System.out.println("Float: " + realFloat);
        realFloat = 2.12e-3f; // "e" es para la notacion cientifica
        System.out.println("Float: " + realFloat);
        System.out.println("float corresponde en byte a: " + Float.BYTES);
        System.out.println("float corresponde en bites a: " + Float.SIZE);
        System.out.println("Valor máximo de float: " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
        
        // Double
        double realDouble = 3.4028235E38; 
        System.out.println("\n Double: " + realDouble);
        System.out.println("double corresponde en byte a: " + Double.BYTES);
        System.out.println("double corresponde en bites a: " + Double.SIZE);
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
    }
}
