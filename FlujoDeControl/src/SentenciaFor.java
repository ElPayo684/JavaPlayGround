public class SentenciaFor {
    public static void main(String[] args) {
        
        // For

        for(int i = 0; i <= 5; i++){
            System.out.println("i = ".concat(Integer.toString(i)));
        }

        String[] names = {"Hugo", "Paco", "Luis", "Bombon", "Burbuja", "Bellota", "Ed", "Edd", "Eddy", "Kendall", "James", "Logan", "Carlos"};
        int count = names.length;
        for(int i = 0; i < count; i++){
            System.out.println("Nombre ".concat(Integer.toString(i)).concat(": ").concat(names[i]));
        }

        // While

        boolean prueba = true;
        int j = 0;
        
        while (prueba) {
            if(j == 7){
                prueba = false;
            }
            System.out.println("j = ".concat(Integer.toString(j)));
            j++;
        }

        // Do While 

        prueba =  false;
        do{
            System.out.println("Se ejecuta solo una vez!");
        }while(prueba);

        // For Each

        int[] primos = {1, 2, 3, 5, 7, 11, 13};

        for(int num: primos){
            System.out.println("num = ".concat(Integer.toString(num)));
        }
        for(String name: names){
            System.out.println("nombre: ".concat(name));
        }

        // Etiquetas

        bucle1: for(int i = 0; i < 5; i++){
            for(int k = 0; k < 5; k++){
                if(i == 2){
                    continue bucle1; // Especifica mediante la etiqueta en que ciclo continuar
                }
                System.out.println("i = " + i + ", k = " + k);
            }
        }
    }
}
