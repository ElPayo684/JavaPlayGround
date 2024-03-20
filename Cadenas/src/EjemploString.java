public class EjemploString {
    public static void main(String[] args) {
        String course = "Programación Java"; // Literal implícita
        String course2 = new String("Programación Java"); // Explicita
        String course3 = new String("programación java");
        // Ambos tienen el mimso valor, pero son objetos distintos.

        boolean equal = course == course2;
        System.out.println(equal); // false, porque son dos objetos distintos 
        equal = course.equals(course2);
        System.out.println(equal); // true, porque tienen el mismo valor asignado
        equal = course.equalsIgnoreCase(course3);
        System.out.println(equal); // true, porque tienen el mismo valor asignado ignorando mayusculas o minusculas
    }
}
