public class StringsConcatenado {
    public static void main(String[] args) {
        String curso = "Programacion Java ";
        String profesor = "Andres Guzman";
        String detalle = curso + "Con el instructor: " + profesor;

        System.out.println(detalle);


        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroB + numeroA));


        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
    }
}
