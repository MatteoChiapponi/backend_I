package Models;

public class Afiliado extends Vendedor{


    public Afiliado(String nombre, Integer puntaje, Integer cantidadVentas) {
        super(nombre, puntaje, cantidadVentas);
    }

    @Override
    public Integer calcularPuntos() {
        int puntos = getCantidadVentas()*15;
        setPuntaje(puntos);
        return puntos;
    }

    @Override
    public void vender() {
        System.out.println("venta exitosa");
        setCantidadVentas(getCantidadVentas()+1);
    }
}
