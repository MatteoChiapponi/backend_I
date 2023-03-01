package Models;

import java.util.ArrayList;

public class Bosque {
    ArrayList<Arbol> arboles;

    public Bosque() {
        arboles= new ArrayList<>();
    }

    public void plantarArbol(Arbol arbol){
        arboles.add(arbol);
    }
    public void mostrarCantidadArboles(){
        System.out.println("la cantidad de arboles plantados es de " + arboles.size());
    }

}
