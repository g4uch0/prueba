import java.sql.SQLOutput;
import java.util.Scanner;
public class factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de factura: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo Producto: ");
        double precio2 = scanner.nextDouble();

        double suma = precio + precio2;
        double impuesto = suma*1.19;
        int resta = -4-2;
        resta -= 4;
        System.out.println("resta = " + resta);
        double resto = impuesto - suma;

        System.out.println(nombre + ". El monto total con impuestos es: " + impuesto + ". El monto sin impuestos es: " + suma);
        System.out.println("Los impuestos son: " + Math.round(resto));




    }
}
