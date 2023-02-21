package Models.Jerarquias;

import Models.Documento;

public class Presidente extends Usuario{
    public Presidente() {
        setNivelAcceso(3);
    }
    @Override
    public void leerDocumento(Documento documento) {
        super.leerDocumento(documento);
    }

}
