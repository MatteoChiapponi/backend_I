import Models.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario matteo = new Usuario("matteo","mi playlist");
        matteo.agregarCancion("cancion piola","matteo","tango");
        matteo.agregarCancion("cancion piola","leando","chamame");
        matteo.agregarCancion("cancion piola","chiapponi","cumbia");
        matteo.agregarCancion("cancion mala","chiapponi","cumbia");
        matteo.agregarCancion("cancion mala","asgf","cumbia");
        matteo.agregarCancion("cancion mala","cponi","cumbia");
        matteo.agregarCancion("cancion maomeno","cponi","cumbia");
    }
}
