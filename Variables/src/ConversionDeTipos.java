public class ConversionDeTipos {
    public static void main(String[] args) {
        
        // String -> Int
        String numeStr = "20";
        int numberInt = Integer.parseInt(numeStr);
        System.out.println("El numero es: " + numberInt);
        // String -> Double
        String doubleString2 = "98765.43e-3";
        double realDouble = Double.parseDouble(doubleString2);
        System.out.println("El numero es: " + realDouble);
        // String -> Boolean
        String booleanString2 = "True";
        boolean realBoolean = Boolean.parseBoolean(booleanString2);
        System.out.println("El booleano es: " + realBoolean);
        
        // Int -> String
        int numerox = 120;
        String realString = Integer.toString(numerox);
        System.out.println("La cadena queda como: " + realString);
        realString = String.valueOf(numerox + 10); // PAra diferenciarlo de la anterior cadena
        System.out.println("La cadena queda como: " + realString);

        // Int -> short/long
        int i = 10000;
        short s = (short)i;
        System.out.println("s = " + s); //de Int a short se puede perder informacion 
        long l = i;
        System.out.println("l = " + l);
    }
}
