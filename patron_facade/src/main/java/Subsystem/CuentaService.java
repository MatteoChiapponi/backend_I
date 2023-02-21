package Subsystem;

import Models.Cuenta;
import java.util.ArrayList;

public class CuentaService {

    private ArrayList<Cuenta> cuentas;

    public Cuenta getCuenta(Integer identificacion){
        var cuentaStream = cuentas.stream().filter(cuenta -> cuenta.getDniTitular() == identificacion).findFirst().get();
        return cuentaStream;
    }
}
