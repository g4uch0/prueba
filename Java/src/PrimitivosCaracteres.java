public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);

        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';

        System.out.println("simbolo = caracter " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("char corresponde en byte =" + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("mAXIMO VALOR DE CHAR" + Character.MAX_VALUE);
        System.out.println("MINIMO VALOR DE CHAR" + Character.MIN_VALUE);



    }
}
