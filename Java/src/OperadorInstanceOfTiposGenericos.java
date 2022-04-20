public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando objeto de la clase String ... quetal!";
        Number num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("Es del tipo String " + b1);
        b1 = texto instanceof Object;
        System.out.println("Es del tipo Object " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num es del tipo Integer: " + b1);
        b1 = num instanceof Number;
        System.out.println("Num es del tipo Integer: " + b1);


    }
}
