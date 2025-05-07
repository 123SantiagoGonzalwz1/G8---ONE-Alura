import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaPelicula consultaPelicula = new ConsultaPelicula();

        System.out.println("Escriba el número de la película que quiere encontrar: ");
        try {
            var numeroDePelicula = Integer.valueOf(lectura.nextLine());
            Pelicula pelicula = consultaPelicula.buscaPelicula(numeroDePelicula);
            System.out.println(pelicula);

            GeneradorDeArchivos generadorDeArchivos = new GeneradorDeArchivos();
            generadorDeArchivos.guardarJson(pelicula);
        } catch (NumberFormatException e) {
            System.out.println("Número de película no encontrado: " + e.getMessage());
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
