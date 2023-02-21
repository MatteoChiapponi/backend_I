package Models;

public class Documento {
    private String mensaje;
    private Integer nivelDeAccesoRequerido;

    public Documento(String mensaje, Integer nivelDeAccesoRequerido) {
        this.mensaje = mensaje;
        this.nivelDeAccesoRequerido = nivelDeAccesoRequerido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Integer getNivelDeAccesoRequerido() {
        return nivelDeAccesoRequerido;
    }
}
