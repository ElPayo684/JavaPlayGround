public class Wrappers {
    public static void main(String[] args) {

        int intPrimitivo = 12345; // Entero primitivo
        Integer intObjeto = Integer.valueOf(intPrimitivo); // Forma Explicita | Autoboxing
        Integer intObjeto2 = intPrimitivo; // Forma implícita | Autoboxing

        int num = intObjeto; // Unboxing Implicito | Int de referencia -> int primitivo
        System.out.println("num = " + num);
        int num2 = intObjeto2.intValue(); // Unboxing Explícito | Int de referencia -> int primitivo
        System.out.println("num2 = " + num2);

        // Suponiendo que es el precio de una pantalla LCD:

        String priceLCD = "67000";
        Integer priceInteger = Integer.valueOf(priceLCD);
        System.out.println("priceInteger = $" + priceInteger);

        // Cualquier operacion aritmética realizada a un objeto, emplea unboxing y se
        // convierte a un valor primitivo.

        Integer[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int suma = 0;

        for(Integer i: enteros){ // El método .intValue() se puede descartar, es indiferente ponerlo ya que se hace automaticamente
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
    }
}
