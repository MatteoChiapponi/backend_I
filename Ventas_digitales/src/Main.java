import Models.Afiliado;
import Models.Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("nico",0,0,1);
        Afiliado afiliado = new Afiliado("matteo",0,0);
        empleado.agregarAfiliado(afiliado);
        empleado.agregarAfiliado(afiliado);
        empleado.vender();
        empleado.vender();
        System.out.println(empleado.calcularPuntos());
        empleado.recategorizar();
        empleado.mostrarCategoria();

        afiliado.vender();
        afiliado.vender();
        afiliado.vender();
        afiliado.vender();
        System.out.println(afiliado.calcularPuntos());
        afiliado.recategorizar();
        afiliado.mostrarCategoria();

    }
}
