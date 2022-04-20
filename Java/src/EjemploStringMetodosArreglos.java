public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.println(arreglo[i]);
        }
        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        int largo1 = arreglo2.length;

        for (int j = 0; j<largo1; j++){
            System.out.println(arreglo2[j]);
        }

        System.out.println();
        String archivo = "alguna.imagen.jpeg";
        String[] archivoArr = archivo.split("[.]");// puede ser tambien con este: \\
        largo = archivoArr.length;
        for (int k = 0; k < largo; k++){
            System.out.println(archivoArr[k]);
        }

        System.out.println("archivoArr = " + archivoArr[largo-2]);

        
    }
}
