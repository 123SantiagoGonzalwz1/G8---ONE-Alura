import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String contrasena = "A143139";

        System.out.println("Ingrese su contraseña: ");
        String validacionUsuario = scanner.nextLine();

        if (validacionUsuario.equals(contrasena)) {
            System.out.println("¡Acceso Permitido!");
        } else {
            System.out.println("¡Acceso Denegado!");
        }
    }
}
