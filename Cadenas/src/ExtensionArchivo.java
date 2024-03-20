public class ExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "algun_archivo.jpeg";
        int posicionPunto = archivo.lastIndexOf(".");

        // System.out.println("Lonigtud del archivo: " + archivo.length());
        // System.out.println("Posicion del punto " + posicionPunto);
        System.out.println("Extension del archivo: " + archivo.substring(posicionPunto + 1).toUpperCase());
    }
}
