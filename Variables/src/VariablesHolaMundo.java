public class VariablesHolaMundo {
        public static void main(String[] args) {
            
            String saludar = "Hola mundo"; // Definimos un objeto string llamado saludar

            System.out.println(saludar);
            System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase()); //saludar es un objeto, por lo que se pueden emplear métodos

            int number = 10;
            System.out.println("número = " + number);

            boolean value = true;

            if(value){
                number = 20;
                System.out.println("número = " + number);
            }
        }
}
