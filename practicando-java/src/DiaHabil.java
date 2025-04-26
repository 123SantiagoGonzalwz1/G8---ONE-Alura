import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día de la semana: ");
        String dia = scanner.nextLine().toLowerCase();

        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") || dia.equals("jueves") || dia.equals("viernes")) {
            System.out.println(dia + " es un día hábil.");
        } else if (dia.equals("sábado") || dia.equals("domingo")) {
            System.out.println(dia + " no es un día hábil.");
        } else {
            System.out.println("El día no se encuentra. Verifica que hayas escrito bien el día: " + dia);
        }
    }
}
