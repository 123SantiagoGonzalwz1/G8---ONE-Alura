import java.util.Scanner;

public class ComprobandoLados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer lado: ");
        int lado1 = scanner.nextInt();
        System.out.println("Ingrese el segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.println("Ingrese el tercer lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los lados pueden forma un triángulo.");
        } else {
            System.out.println("No es posible forma un triangulo.");
        }
    }
}
