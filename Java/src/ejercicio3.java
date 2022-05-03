import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("nombre1 = " + nombre1);
        String nombre2 = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("nombre2 = " + nombre2);
        String nombre3 = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("nombre3 = " + nombre3);

        String max = nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length() ? nombre1 : nombre2;
        max = nombre3.split(" ")[0].length() > max.split(" ")[0].length() ? nombre3 : max;

        System.out.println("El nombre mas largo es: " + max);





    }
}
