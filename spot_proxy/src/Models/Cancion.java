package Models;

public class Cancion {
    private String nombre;
    private String artista;

    public Cancion(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }
}
