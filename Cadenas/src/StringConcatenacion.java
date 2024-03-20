public class StringConcatenacion {
    public static void main(String[] args) {
        String course = "Programación Java";
        String student = "Eddard";

        String detail = "La clase de " + course + " la toma " + student;
        System.out.println(detail);

        // Otra manera mas eficiente de concatenar strings:

        detail = student.concat(" esta aprendiendo ").concat(course.toLowerCase()); // El metodo concat es eficiente con pocos caracteres
        System.out.println(detail); 

        // Tener en cuenta que StringBuilder es aun más eficiente que el metodo concat()
        
        /*
         * StringBuilder sb = new StringBuilder(a);
         * 
         * sb.append(x).append(y);
         */
    }
}
