public class Main {
    public static void main(String[] args) {
        System.out.println("¡Bienvenid@ a Screen Match!");
        System.out.println("Película: Matrix.");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                    Matrix es una paradoja.
                    Se considera la mejor película del fin del milenio.
                    Fué lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        // Casting Explícito
        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

        double temperaturaCelsius = 64;
        double toFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.printf("Los %s° de temperatura en Fahrenheit son: %.2f%n", temperaturaCelsius, toFahrenheit);

        int toFahrenheit2 = (int) toFahrenheit;
        System.out.println(toFahrenheit);
    }
}