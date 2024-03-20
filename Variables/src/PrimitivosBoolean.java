public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean logicData = true;
        System.out.println("Dato lógico: " + logicData);

        double d = 98765.43e-3;
        System.out.println(d);
        float f = 1.2345e2f;
        System.out.println(f);

        logicData = d > f;
        System.out.println("Dato lógico = " + logicData);
    }
}
