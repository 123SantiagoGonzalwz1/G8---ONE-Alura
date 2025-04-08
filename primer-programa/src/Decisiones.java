public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2024) {
            System.out.println("Películas más populares.");
        } else {
            System.out.println("Películas Reto que aún vale la pena ver.");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su película.");
        } else {
            System.out.println("Película no disponible en su Plan Actual.");
        }
    }
}
