package Models.Jerarquias;

import Models.Documento;

public abstract class Usuario {
    private Usuario usuarioSiguiente;
    private Integer nivelAcceso;
    public void leerDocumento(Documento documento){
        if (getUsuarioSiguiente() != null) getUsuarioSiguiente().leerDocumento(documento);
        if (this.getNivelAcceso() >= documento.getNivelDeAccesoRequerido()) {
            String mensaje = "el nivel del acceso del doc es " + documento.getNivelDeAccesoRequerido() + " aqui esta el mensaje: " + documento.getMensaje() + " y tu noivel de acceso es " + this.getNivelAcceso();
            System.out.println(mensaje);
        }
        else
            System.out.println("no podes leer este mensaje debido a tu nivel de acceso " + this.getNivelAcceso());
    }

    public Integer getNivelAcceso() {
        return nivelAcceso;
    }

    public Usuario getUsuarioSiguiente() {
        return usuarioSiguiente;
    }

    public void setUsuarioSiguiente(Usuario usuarioSiguiente) {
        this.usuarioSiguiente = usuarioSiguiente;
    }

    public void setNivelAcceso(Integer nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
}
