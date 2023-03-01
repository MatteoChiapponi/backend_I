package Models;

import Models.FlyweightFactorys.ArbolFlyweightFactory;

public class PlatadorDeArboles {
    private String nombre;
    private Bosque bosque;

    public PlatadorDeArboles(String nombre) {
        bosque= new Bosque();
        this.nombre = nombre;
    }
    public Arbol plantarArbol(String color,String tipoDeArbol,Double alto, Double ancho){
        Arbol arbol = ArbolFlyweightFactory.getArbol(color);
        arbol.setTipoDeArbol(tipoDeArbol);
        arbol.setAlto(alto);
        arbol.setAncho(ancho);
        bosque.plantarArbol(arbol);
        return arbol;
    }
    public void mostrar(){
        bosque.mostrarCantidadArboles();
    }
}
