import java.util.Scanner;

public class SeguridadSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código de acceso: ");
        int codigoAcceso = scanner.nextInt();
        System.out.println("Ingrese el nivel de permiso: ");
        int nivelPermiso = scanner.nextInt();

        if (codigoAcceso == 2023 && (nivelPermiso == 1 || nivelPermiso == 2 || nivelPermiso == 3)) {
                System.out.println("Acceso Permitido. ¡Bienvenido al Sistema!");
        } else {
            System.out.println("Acceso Denegado.");
        }
    }
}
