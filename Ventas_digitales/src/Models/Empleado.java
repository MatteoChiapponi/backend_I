package Models;

import java.util.ArrayList;

public class Empleado extends Vendedor{
    private ArrayList<Afiliado> afiliados;
    private Integer antiguedad;

    public Empleado(String nombre, Integer puntaje, Integer cantidadVentas, Integer antiguedad) {
        super(nombre, puntaje, cantidadVentas);
        this.antiguedad = antiguedad;
        afiliados = new ArrayList<>();
    }


    @Override
    public Integer calcularPuntos() {
        int cantidadAfiliados = afiliados.size()*10;
        int anios = antiguedad*5;
        int ventas = getCantidadVentas()*5;
        int total = cantidadAfiliados+anios+ventas;
        setPuntaje(total);
        return total;
    }

    @Override
    public void vender() {
        System.out.println("venta exitosa");
        setCantidadVentas(getCantidadVentas()+1);
    }

    public void agregarAfiliado(Afiliado afiliado){
        afiliados.add(afiliado);
    }

}
