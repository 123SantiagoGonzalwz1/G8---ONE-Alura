import com.aluracursos.screematch.models.Episodio;
import com.aluracursos.screematch.models.FiltroRecomendacion;
import com.aluracursos.screematch.models.Pelicula;
import com.aluracursos.screematch.models.Serie;
import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);

        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();

        casaDragon.setNombre("La casa del dragón");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println("Tiempo necesarios para ver tus titulos favoritos estas vaciones " + calculadora.getTiempoTotal() + " minutos.");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtrar(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("La casa Targaryen.");
        episodio.setNumero(1);
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtrar(episodio);

        var xMen = new Pelicula();
        xMen.setNombre("X-MEN");
        xMen.setDuracionEnMinutos(180);
        xMen.setFechaDeLanzamiento(2000);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(xMen);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());


        System.out.println(listaDePeliculas.toString());
        System.out.println("toString de la película: " + listaDePeliculas.get(0).toString());
    }
}
