package Facade;

import Models.Cuenta;
import Subsystem.AutenticationService;
import Subsystem.CajaService;
import Subsystem.CuentaService;

public class FacadeImplementation implements Facade {
    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;

    public FacadeImplementation() {
        autenticationService= new AutenticationService();
        cuentaService= new CuentaService();
        cajaService= new CajaService();
    }
    @Override
    public void retirarDinero(Integer numIdentificacion, String contraseña, Double saldo) {
        Cuenta cuenta1 = cuentaService.getCuenta(numIdentificacion);
        if (cuenta1 != null) {
            System.out.println("identificacion valida");
            if (autenticationService.validarUsuarioYContrasena(numIdentificacion, contraseña, cuenta1)) {
                System.out.println("contraseña valida");
                if (cuenta1.getSaldo() >= saldo) {
                    System.out.println("saldo suficiente");
                    cajaService.entregarDinero(saldo);
                }
            }
        }
        else
            System.out.println("cuenta no encontrada");
    }
}
