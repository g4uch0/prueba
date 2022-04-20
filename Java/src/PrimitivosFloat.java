public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 1.5e-10f; //2120f;
        System.out.println("real = " + realFloat);
        System.out.println("Float corresponde en byte a " + Float.BYTES);
        System.out.println("FLOAT CORRESPONDE EN BITES A = " + Float.SIZE);
        System.out.println("MAXIMO VALOR PARA UN FLOAT = " + Float.MAX_VALUE);
        System.out.println("MINIMO VALOR PARA UN FLOAT = " + Float.MIN_VALUE);


        double realDouble =3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en byte a " + Double.BYTES);
        System.out.println("Double CORRESPONDE EN BITES A = " + Double.SIZE);
        System.out.println("MAXIMO VALOR PARA UN double = " + Double.MAX_VALUE);
        System.out.println("MINIMO VALOR PARA UN double = " + Double.MIN_VALUE);

        
        float varFloat = 3.1416f;
        System.out.println("varFloat = " + varFloat);

    }
}
