public class ValidarString {
    public static void main(String[] args) {
        String course = null;

        boolean isNull = course == null;

        System.out.println("Is null: " + isNull);

        if(isNull){
            course = " ";
        }

        System.out.println(course);

        boolean isEmpty = course.isEmpty(); // Reconoce el espacio como caracter
        System.out.println("Esta vacío : " + isEmpty);
        boolean isBlank = course.isBlank(); // Evalua si hay un caracter distinto a espacio en el arreglo
        System.out.println("Esta vacío : " + isBlank);

        if(!isEmpty){
            if(isBlank){
                course = "Programación Java";
            }
        }

        System.out.println("Bienvenido a " + course);

        // Métodos importantes

        System.out.println("course.length() = " + course.length());
        System.out.println("course.toLowerCase() = " + course.toLowerCase());
        System.out.println("course.toUpperCase() = " + course.toUpperCase());
    }
}
