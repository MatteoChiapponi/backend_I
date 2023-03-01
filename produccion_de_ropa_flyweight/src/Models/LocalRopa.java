package Models;

import Models.FlyweightesFactorys.RopaFlyWeightFactory;

import java.util.ArrayList;

public class LocalRopa {
    private String nombre;
    private static final ArrayList<Ropa> talleM = new ArrayList<>();
    private static final  ArrayList<Ropa> talleS = new ArrayList<>();
    private static final ArrayList<Ropa> talleXs = new ArrayList<>();
    private static final ArrayList<Ropa> ropaImportada = new ArrayList<>();
    private static final ArrayList<Ropa> ropaVieja = new ArrayList<>();

    public LocalRopa(String nombre) {
        this.nombre = nombre;
    }
    public Ropa crearRopa(String tipoPrenda,String talle, boolean esNuevo, boolean esImportado){
        Ropa ropa= RopaFlyWeightFactory.getRopa(tipoPrenda);
        ropa.setTalle(talle);
        ropa.setEsNuevo(esNuevo);
        ropa.setEsImportada(esImportado);
        if (talle.equals("xs"))
            talleXs.add(ropa);
        else if (talle.equals("s"))
            talleS.add(ropa);
        else
            talleM.add(ropa);
        if (esImportado)
            ropaImportada.add(ropa);
        if (!esNuevo)
            ropaVieja.add(ropa);
        System.out.println(ropa);
        return ropa;
    }
}
