package Models;

import java.util.ArrayList;

public class ListaReproduccion {
    private String nombre;
    ArrayList<Cancion> listaCanciones;

    public ListaReproduccion(String nombre) {
        listaCanciones= new ArrayList<>();
        this.nombre = nombre;
    }
    public void addCancion(Cancion cancion){
        listaCanciones.add(cancion);
        System.out.println("se agrega cancion "+cancion.getNombre()+" a la playlist "+nombre);
    }
    public void removeCancion(Cancion cancion){
        if (listaCanciones.contains(cancion)){
            listaCanciones.remove(cancion);
            System.out.println("se agrega cancion "+cancion.getNombre()+" a la playlist "+nombre);
        }
        else
            System.out.println("no se puede remover una cancion que no esta en la playlist");
    }
}
