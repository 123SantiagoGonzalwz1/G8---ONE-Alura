public class Aprobado {
    public static void main(String[] args) {
        double nota1 = 8.2, nota2 = 7, nota3 = 6.5;
        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7.0) {
            System.out.println("El estudiante tuvo un promedio de " + promedio + " y fue aprobado.");
        } else if (promedio >= 5.0 && promedio <= 6.9) {
            System.out.println("El estudiante tuvo un promedio de " + promedio + " y está en recuperación.");
        } else {
            System.out.println("El estudiante tuvo un promedio de " + promedio + " y fue reprobado.");
        }
    }
}
