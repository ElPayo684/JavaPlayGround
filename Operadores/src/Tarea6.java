import javax.swing.JOptionPane;

public class Tarea6 {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Ingresa un nombre y apellido");
        String secondName = JOptionPane.showInputDialog("Ingresa un nombre y apellido");
        String thirdName = JOptionPane.showInputDialog("Ingresa un nombre y apellido");

        String max = (firstName.split(" ")[0].length() < secondName.split(" ")[0].length()) ? secondName : firstName;
        max = (thirdName.split(" ")[0].length() < max.split(" ")[0].length()) ? max : thirdName;

        System.out.println("La persona con el nombre mas largo es: ".concat(max));
    }
}
