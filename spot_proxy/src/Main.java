import Models.Cancion;
import Models.TipoUsuario;
import Models.Usuario;

public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("asdf","asdfasd");

        Usuario usuario1 = new Usuario("matteo", TipoUsuario.Premium);
        Usuario usuario2 = new Usuario("leandro", TipoUsuario.Free);

        usuario1.descargarCancion(cancion);
        usuario2.descargarCancion(cancion);
    }
}
