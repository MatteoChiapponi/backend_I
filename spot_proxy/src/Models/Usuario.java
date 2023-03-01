package Models;

import Services.DescargarCancion;
import Services.ProxyServices.DescargaServiceProxy;

public class Usuario implements DescargarCancion{
    private String nombre;
    private TipoUsuario tipoUsuario;
    private DescargaServiceProxy proxy;

    public Usuario(String nombre, TipoUsuario tipoUsuario) {
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        if (tipoUsuario.equals(TipoUsuario.Premium))
            DescargaServiceProxy.agregarUsuario(this);
        proxy=new DescargaServiceProxy(this);
    }

    @Override
    public Cancion descargarCancion(Cancion cancion) {
        Cancion cancion1=proxy.descargarCancion(cancion);
        if (cancion1!=null){
            System.out.println("descargaste correctamente la cancion "+ cancion1.getNombre() + " del artista " + cancion1.getArtista());
            return cancion1;
        }
        else{
            System.out.println("no podes descargar la cancion debido a que no sos un usuario premium");
            return null;
        }
    }
}
