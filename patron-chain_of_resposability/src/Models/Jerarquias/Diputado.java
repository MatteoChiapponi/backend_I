package Models.Jerarquias;

import Models.Documento;

public class Diputado extends Usuario{
    public Diputado() {
        setNivelAcceso(1);
        setUsuarioSiguiente(new Ministro());
    }
    @Override
    public void leerDocumento(Documento documento) {
        super.leerDocumento(documento);
    }
}
