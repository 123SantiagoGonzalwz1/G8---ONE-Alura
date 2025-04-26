import java.util.Scanner;

public class Comparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Ambos números son iguales.");
        } else if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1 + ".");
        } else {
            System.out.println("El número mayor es: " + numero2 + ".");
        }
    }
}
