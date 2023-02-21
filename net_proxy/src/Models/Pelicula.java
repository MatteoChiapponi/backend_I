package Models;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String nombre;
    private String url;
    private ArrayList<String> paisesHabilitados;

    public Pelicula(String nombre, String url) {
        paisesHabilitados = new ArrayList<>();
        this.nombre = nombre;
        this.url = url;
    }

    public void agregarPaisHabilitado(String pais){
        paisesHabilitados.add(pais);
    }
    public ArrayList<String> getPaisesHabilitados() {
        return paisesHabilitados;
    }

    public String getUrl() {
        return url;
    }

    public String getNombre() {
        return nombre;
    }
}
