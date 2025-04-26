import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del préstamo: ");
        int valor = scanner.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println(valor  + " esta dentro del rango del préstamo permitido.");
        } else {
            System.out.println("El valor " + valor + " no está dentro del intervalo permitido para el prestamo.");
        }
    }
}
