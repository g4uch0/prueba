import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(curso == null) {
            curso = " ";//"Programacion Java";
        }
        
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);
        
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);
        
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);
        if(curso.isBlank() == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso".concat(curso));
        }


    }
}
