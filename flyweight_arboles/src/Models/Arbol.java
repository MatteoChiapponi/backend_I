package Models;

public class Arbol {
    private String color;
    private String tipoDeArbol;
    private Double alto;
    private Double ancho;

    public Arbol(String color) {
        this.color = color;
    }
    public void setTipoDeArbol(String tipoDeArbol) {
        this.tipoDeArbol = tipoDeArbol;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public Double getAlto() {
        return alto;
    }

    public Double getAncho() {
        return ancho;
    }
}
