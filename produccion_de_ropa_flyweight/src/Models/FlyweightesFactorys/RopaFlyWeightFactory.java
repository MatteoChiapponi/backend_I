package Models.FlyweightesFactorys;

import Models.Ropa;
import java.util.ArrayList;
import java.util.HashMap;

public class RopaFlyWeightFactory {
    private static final  ArrayList<Ropa> talleM = new ArrayList<>();
    private static final  ArrayList<Ropa> talleS = new ArrayList<>();
    private static final ArrayList<Ropa> talleXs = new ArrayList<>();
    private static final ArrayList<Ropa> ropaImportada = new ArrayList<>();
    private static final ArrayList<Ropa> ropaVieja = new ArrayList<>();
    private static final  HashMap<String,Ropa> tipoDePrendaMap = new HashMap<>();

    public static Ropa getRopa(String tipoPrenda){
        Ropa prenda = tipoDePrendaMap.get(tipoPrenda);
        if (prenda==null){
            System.out.println("se creo una prenda de tipo " + tipoPrenda);
            prenda=new Ropa(tipoPrenda);
            tipoDePrendaMap.put(tipoPrenda,prenda);
        }
        return prenda;
    }
}
