package Models;

import java.util.ArrayList;

public class Documento {
    private Integer id;
    private String url;
    private String contenido;
    private ArrayList<Usuario> usuariosAutorizados;

    public Documento(Integer id, String url, String contenido) {
        usuariosAutorizados = new ArrayList<>();
        this.id = id;
        this.url = url;
        this.contenido = contenido;
    }

    public ArrayList<Usuario> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }
    public void agregarUsuarioHabilitado(Usuario usuario){
        usuariosAutorizados.add(usuario);
    }

    public String getUrl() {
        return url;
    }

    public String getContenido() {
        return contenido;
    }
}
