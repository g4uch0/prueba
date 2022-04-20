public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Facundo";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Facundo\") = " + nombre.equals("Facundo"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("facundo"));
        System.out.println("nombre.compareTo(\"Facundo\") = " + nombre.compareTo("Facundo"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre = " + nombre);
        System.out.println("nombre.substring(1) = " + nombre.substring(1, 4));
        
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \"1\") = " + trabalenguas.replace("a", "1"));
        System.out.println("trabalenguas.indexOf('b') = " + trabalenguas.indexOf('b'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('f') = " + trabalenguas.indexOf('f'));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));

        System.out.println("     Hola que tal como estas? que contas de lindo?      ".trim());


        
    }
}
