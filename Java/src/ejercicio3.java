import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de 1 familiar: ");
        String nombre1 = scanner.nextLine();
        String nombre1A = nombre1.substring(1,2).toUpperCase() + "." + nombre1.substring(nombre1.length()-2);
        System.out.println("nombre1A = " + nombre1A);


        System.out.println("Ingrese el nombre de 1 familiar: ");
        String nombre2 = scanner.nextLine();
        String nombre2A = nombre2.substring(1,2).toUpperCase() + "." + nombre2.substring(nombre2.length()-2);


        System.out.println("Ingrese el nombre de 1 familiar: ");
        String nombre3 = scanner.nextLine();
        String nombre3A = nombre3.substring(1,2).toUpperCase() + "." + nombre3.substring(nombre3.length()-2);

        String nombres = nombre1A + "_" + nombre2A + "_" + nombre3A;
        System.out.println("nombres = " + nombres);



    }
}
