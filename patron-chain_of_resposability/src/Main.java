import Models.Documento;
import Models.Jerarquias.Diputado;
import Models.Jerarquias.Ministro;
import Models.Jerarquias.Presidente;
import Models.Jerarquias.Usuario;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("todos lo pueden leer", 3);
        Usuario diputado = new Diputado();
        diputado.leerDocumento(documento);
    }
}
