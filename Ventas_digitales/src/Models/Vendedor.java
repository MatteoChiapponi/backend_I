package Models;

import Models.Categorias.*;

public abstract class Vendedor {
    private String nombre;
    private Categoria categoria;
    private Integer puntaje;
    private Integer cantidadVentas;

    public Vendedor(String nombre, Integer puntaje, Integer cantidadVentas) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.cantidadVentas = cantidadVentas;
    }


    public void mostrarCategoria(){
        System.out.println("tu categoria es: " +categoria.getNombre());
    }
    public abstract Integer calcularPuntos();

    public void recategorizar(){
        if (puntaje < 20)
            categoria = new Novato();
        else if (puntaje <= 30)
            categoria = new Aprendiz();
        else if (puntaje <= 40)
            categoria = new Bueno();
        else categoria = new Maestro();

    }
    public abstract void vender();

    public Integer getCantidadVentas() {
        return cantidadVentas;
    }
    public void setCantidadVentas(Integer cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }
}
