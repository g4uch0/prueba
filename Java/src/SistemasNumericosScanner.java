
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");

        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();// Integer.parseInt(numeroStr);
        } catch(Exception e){
            System.out.println("Error debe ingresar un entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero Binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);


        String mensajeOctal = "numero octal de " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);

        String mensajeHexa ="numero hexadecimal " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal) ;


        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexa ;

        System.out.println(mensaje);
    }
}
