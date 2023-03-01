import Models.Cuenta;
import Subsystem.CajaService;
import Subsystem.CuentaService;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1234,"hola1234",10000.0);
        Cuenta cuenta2 = new Cuenta(5678,"hola1234",10000.0);
        Cuenta cuenta3 = new Cuenta(1010,"hola1234",10000.0);
        Cuenta cuenta4 = new Cuenta(1212,"hola1234",10000.0);
        Cuenta cuenta5 = new Cuenta(1313,"hola1234",10000.0);
        CuentaService.agregarCuentas(cuenta1);
        CuentaService.agregarCuentas(cuenta2);
        CuentaService.agregarCuentas(cuenta3);
        CuentaService.agregarCuentas(cuenta4);
        CuentaService.agregarCuentas(cuenta5);
        cuenta1.retirarDinero(1234,"hola1234",10000.0);
    }

}
