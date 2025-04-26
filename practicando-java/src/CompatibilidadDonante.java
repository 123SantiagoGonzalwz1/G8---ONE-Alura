import java.util.Scanner;

public class CompatibilidadDonante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la edad del donante: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el peso del donante (en kg): ");
        int peso = scanner.nextInt();

        if (edad >= 18 && edad <= 65 && peso >= 50) {
            System.out.println("El donante si es compatible.");
        } else {
            System.out.println("El donante no es compatible");
            if (edad < 18  || edad > 65 ) {
                System.out.println("Motivo: debe tener entre 18 y 25 años.");
            }
            if (peso < 50) {
                System.out.println("Motivo: debe pesar más de 50kg.");
            }
        }
    }
}
