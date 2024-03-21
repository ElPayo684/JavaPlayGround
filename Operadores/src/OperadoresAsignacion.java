public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Valor inicial: " + i);
        i += 3;
        System.out.println("Valor de i: " + i);
        i += 2;
        System.out.println("Valor de i: " + i);
        i -= 4;
        System.out.println("Valor de i: " + i);
        i *= 20;
        System.out.println("Valor de i: " + i);
        i /= 4;
        System.out.println("Valor de i: " + i);
        
        // Operador Unario:

        int j = -i;
        System.out.println(j);
        j = -j;
        System.out.println(j);

        // Operadores Incrementales

        // Preincremento | Primero incrementa y luego asigna, por eso coinciden
        int x = 1;
        int y = ++x; // i = i + 1

        System.out.println("Pre-incremento");
        System.out.println("x = " + x);
        System.out.println("y = " + y); 
        
        // Post-incremento | primero asigna y luego incrementa
        x = 1;
        y = x++; // i = i + 1

        System.out.println("Post-incremento");
        System.out.println("x = " + x);
        System.out.println("y = " + y); 

        // Predecremento | Primero resta y luego asigna, por eso coinciden
        x = 1;
        y = --x; // i = i + 1

        System.out.println("Pre-decremento");
        System.out.println("x = " + x);
        System.out.println("y = " + y); 
        
        // Post-decremento | primero asigna y luego resta
        x = 1;
        y = x--; // i = i + 1

        System.out.println("Post-decremento");
        System.out.println("x = " + x);
        System.out.println("y = " + y); 
    }
}
