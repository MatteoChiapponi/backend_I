package Models.FlyweightFactorys;

import Models.Arbol;
import java.util.HashMap;

public class ArbolFlyweightFactory {
    private static final HashMap<String, Arbol> arbolMap = new HashMap<>();
    public static Arbol getArbol(String color){
        Arbol arbol = arbolMap.get(color);
        if (arbol == null){
            System.out.println("se creo un arbol de color " + color);
            arbol=new Arbol(color);
            arbolMap.put(color,arbol);
        }
        return arbol;
    }

}
