import java.util.Scanner;

public class OperadoresLogicosLoginTernario {
    public static void main(String[] args) {

        /*String[] usernames = new String[2];
        String[] passwords = new String[2];
        usernames[0] = "Andres";
        String username = "Andres";
        passwords[0] = "12345";
        usernames[1] = "Facu";
        passwords[1] = "1234";*/
        String[] usernames = {"facu","andres"};
        String[] passwords = {"loca23", "hola"};



        boolean esAutenticado = false;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el username: ");

            String u = scanner.nextLine();

            System.out.println("Ingrese la password");
            String p = scanner.nextLine();

            for (int i = 0; i < usernames.length; i++){
                esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
                break;
                /*if ( (usernames[i].equals(u) && passwords[i].equals(p)) ) {
                    esAutenticado = true;
                    break;

                }*/


            }
            String mensaje = esAutenticado ? "Ingreso correctamente, Bienvenido: ".concat(u) :
            "Usuario incorrecto\n Requiere Autenticacion.";
        System.out.println(mensaje);
            /*if(esAutenticado){
                System.out.println("Ingreso correctamente");
                System.out.println("Bienvenido usuario: ".concat(u).concat("!"));

            }else{
                System.out.println("Usuario y/o contraseña incorrecto.");
            }*/

        }
}
