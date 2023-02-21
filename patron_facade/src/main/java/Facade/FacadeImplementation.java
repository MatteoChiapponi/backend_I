package Facade;

import Models.Cuenta;
import Subsystem.AutenticationService;
import Subsystem.CajaService;
import Subsystem.CuentaService;

public class FacadeImplementation implements Facade {


    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;


    @Override
    public void retirarDinero(Integer numIdentificacion, String contraseña, Double saldo) {
        Cuenta cuenta = cuentaService.getCuenta(numIdentificacion);
        if (cuenta != null){
            if (autenticationService.validarUsuarioYContrasena(numIdentificacion, contraseña, cuenta)){
                var disponible = cuenta.getSaldo();
                if (disponible >= saldo){
                    cajaService.entregarDinero(saldo);
                }
            }
        }
    }
}
