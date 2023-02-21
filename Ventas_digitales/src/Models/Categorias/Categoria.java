package Models.Categorias;

public abstract class Categoria {
    private String nombre;

    public Categoria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
