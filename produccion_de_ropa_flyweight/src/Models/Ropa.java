package Models;
public class Ropa {
    private String talle;
    private String tipoPrenda;
    private boolean esNuevo;
    private boolean esImportada;
    public Ropa(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }
    public void setTalle(String talle) {
        this.talle = talle;
    }
    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
    public void setEsImportada(boolean esImportada) {
        this.esImportada = esImportada;
    }

    public String getTalle() {
        return talle;
    }
}
