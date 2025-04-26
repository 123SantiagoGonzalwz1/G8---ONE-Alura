import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.00) {
            double descuento = valorCompra * 0.1;
            valorCompra -= descuento;
            System.out.println("Descuento del 10% aplicado.");
            System.out.println("Nuevo valor: $" + valorCompra + ".");
        } else {
            System.out.println("Lo siento, no aplicas al descuento.");
            System.out.println("Valor total: $" + valorCompra + ".");;
        }
    }
}
