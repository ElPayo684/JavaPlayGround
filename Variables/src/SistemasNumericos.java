public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("El número decimal es: " + numeroDecimal);
        System.out.println("La representación del número decimal a binario queda como: " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;
        System.out.println("Nuestro número es: " + numeroBinario); // Se imprime como decimal a pesar de ser escrito como binario 
        System.out.println("La representación del número decimal a octal queda como: " + Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764; // Octal integer es con un cero al principio
        System.out.println("Nuestro número es: " + numeroOctal); // Se imprime como decimal a pesar de ser escrito como binario 
        System.out.println("La representación del número decimal a haxadecimal queda como: " + Integer.toHexString(numeroOctal));

        int numeroHex = 0x1f4;
        System.out.println("Nuestro número es: " + numeroHex);
    }
}
