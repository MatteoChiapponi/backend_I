package Services;

import Models.Cancion;

public class DescargaService implements DescargarCancion{

    @Override
    public Cancion descargarCancion(Cancion cancion) {
        return cancion;
    }
}
