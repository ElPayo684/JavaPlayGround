import javax.swing.JOptionPane;

public class SistemasNumericosConInput {
    public static void main(String[] args) {
        String numStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int string2Int = Integer.parseInt(numStr);
        System.out.println("El número decimal es: " + string2Int);
        System.out.println("La representación del número decimal a binario queda como: " + Integer.toBinaryString(string2Int));

        String mensaje = "Número binario de " + string2Int + " = " + Integer.toBinaryString(string2Int);
        mensaje += "\nNúmero Octal de " + string2Int + " = " + Integer.toOctalString(string2Int);
        mensaje += "\nNúmero Hexadecimal de " + string2Int + " = " + Integer.toHexString(string2Int);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
