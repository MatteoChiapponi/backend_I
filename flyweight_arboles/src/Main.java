import Models.Arbol;
import Models.PlatadorDeArboles;

public class Main {
    public static void main(String[] args) {
        PlatadorDeArboles platadorDeArbol = new PlatadorDeArboles("matteo");

        for (int i = 0; i <= 6; i++) {
        platadorDeArbol.plantarArbol("verde","Ornamental",200.0,400.0);
        platadorDeArbol.plantarArbol("rojo","Frutal",500.0,300.0);
        }

        Arbol arbol1 = platadorDeArbol.plantarArbol("verde","Ornamental",123.0,321.0);
        Arbol arbol2 = platadorDeArbol.plantarArbol("verde","Ornamental",1100.0,400.0);
        Arbol arbol3 = platadorDeArbol.plantarArbol("rojo","Frutal",987.0,999.0);
        Arbol arbol4 = platadorDeArbol.plantarArbol("rojo","Frutal",789.0,300.0);

        System.out.println("arbol 1 ancho: "+arbol1.getAncho());
        System.out.println("arbol 1 alto: "+arbol1.getAlto());
        System.out.println(arbol2.getAncho());
        System.out.println(arbol2.getAlto());

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
        platadorDeArbol.mostrar();

    }
}
