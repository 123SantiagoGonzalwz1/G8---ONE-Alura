import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Peter Parker";
        String accountType = "Ahorros";
        double balance = 599.999;
        int option = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("\nNombre del Cliente: " + name);
        System.out.println("Tipo de Cuenta: " + accountType);
        System.out.println("Saldo disponible: " + balance + "$");
        System.out.println("\n*****************************");

        String menu = """
                    *** Ingrese el número de opción que desea consultar. ***
                    1- Consultar Saldo.
                    2- Retirar.
                    3- Depositar.
                    9- Salir.
                """;

        while (option != 9) {
            System.out.println(menu);
            option = userInput.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Su saldo actual es: " + balance + "$");
                    break;
                case 2:
                    System.out.println("¿Cuánto dinero quieres retirar?");
                    double valueToWithdraw = userInput.nextDouble();

                    if (valueToWithdraw > balance) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        balance -= valueToWithdraw;
                        System.out.println("Su saldo actualizado es: " + balance + "$");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuánto dinero quieres depositar?");
                    double valueToDeposit = userInput.nextDouble();

                    balance += valueToDeposit;
                    System.out.println("Su saldo actualizado es: " + balance + "$");
                    break;
                case 9:
                    System.out.println("¡Gracias por utilizar nuestros servicios! Saliendo...");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida.");
                    break;
            }
        }
    }
}