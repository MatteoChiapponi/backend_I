package Models.FactorysFlyweight;

import Models.Cancion;

import java.util.HashMap;

public class CancionFactoryFlyweight {
    private static final HashMap<String, Cancion> cancionesMap = new HashMap<>();
    public static Cancion getCancion(String nombreCancion){
        Cancion cancion = cancionesMap.get(nombreCancion);
        if (cancion == null){
            cancion = new Cancion(nombreCancion);
            cancionesMap.put(nombreCancion,cancion);
            System.out.println("INSTANCIAMOS UNA CANCION CON EL NOMBRE: "+nombreCancion);
        }
        return cancion;
    }
}
