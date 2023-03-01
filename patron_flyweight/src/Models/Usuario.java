package Models;

import Models.FactorysFlyweight.CancionFactoryFlyweight;

public class Usuario {
    private String nombre;
    private ListaReproduccion playList;

    public Usuario(String nombre, String nombrePlayList) {
        playList=new ListaReproduccion(nombrePlayList);
        this.nombre = nombre;
    }
    public void agregarCancion(String nombre, String artista, String genero){
        Cancion cancion = CancionFactoryFlyweight.getCancion(nombre);
        cancion.setArtista(artista);
        cancion.setGenero(genero);
        playList.addCancion(cancion);
    }
}
