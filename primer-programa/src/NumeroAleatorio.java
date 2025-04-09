import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        System.out.println(numeroAleatorio);
        int intentos = 0;

        while (intentos < 5) {
            System.out.println("Adivina un número entre 0 y 100: ");
            int numeroDeUsuario = entradaUsuario.nextInt();
            intentos++;

            if (numeroDeUsuario == numeroAleatorio) {
                System.out.println("Adivinaste el numero: " + numeroAleatorio + " en " + intentos + " intentos.");
                break;
            } else if (numeroDeUsuario > numeroAleatorio) {
                    System.out.println("El número es menor.");
            } else {
                    System.out.println("El número es mayor.");
            }

            System.out.println("Sigue intentando.");

            if (intentos == 5) {
                System.out.println("Lo siento alcanzaste el limite de intentos. El número entre 0 a 100 era: " + numeroAleatorio);
            }
        }
    }
}
