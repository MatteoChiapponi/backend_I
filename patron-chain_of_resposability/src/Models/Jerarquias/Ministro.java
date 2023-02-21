package Models.Jerarquias;

import Models.Documento;

public class Ministro extends Usuario{
    public Ministro() {
        setNivelAcceso(2);
        setUsuarioSiguiente(new Presidente());
    }
    @Override
    public void leerDocumento(Documento documento) {
         super.leerDocumento(documento);
    }
}
