package Services;

import Models.Pelicula;
import java.util.ArrayList;

public class PeliculaService implements VerPelicula{
    private ArrayList<Pelicula> peliculas;

    public PeliculaService() {
        peliculas= new ArrayList<>();
    }

    @Override
    public Pelicula getPelicula(String nombrePelicula) {
        for (Pelicula pel:peliculas) {
            if (pel.getNombre().equals(nombrePelicula))
                return pel;
        }
        System.out.println("no exite la pelicula");
        return null;
    }
    public void agregarPel(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    public ArrayList<String> obtenerPaisesHabilitados(String nombrePelicula){
        for (Pelicula pel:peliculas) {
            if (pel.getNombre().equals(nombrePelicula))
                return pel.getPaisesHabilitados();
        }
        System.out.println("no encontramos la pelicula");
        return null;
    }
}
