package Services.ProxyServices;

import Models.Cancion;
import Models.Usuario;
import Services.DescargaService;
import Services.DescargarCancion;

import java.util.ArrayList;

public class DescargaServiceProxy implements DescargarCancion {
    public static final ArrayList<Usuario> usuariosPremium = new ArrayList<>();
    private Usuario usuario;
    private DescargaService descargaService;

    public DescargaServiceProxy(Usuario usuario) {
        descargaService=new DescargaService();
        this.usuario = usuario;
    }

    public static void agregarUsuario(Usuario usuarioPremium){
        usuariosPremium.add(usuarioPremium);
    }
    @Override
    public Cancion descargarCancion(Cancion cancion) {
        if (usuariosPremium.contains(usuario))
            return descargaService.descargarCancion(cancion);
        return null;
    }
}
