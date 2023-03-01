package Subsystem;

import Models.Cuenta;
import java.util.ArrayList;

public class CuentaService {
    private static ArrayList<Cuenta> cuentas = new ArrayList<>();

    public Cuenta getCuenta(Integer identificacion){
        for (Cuenta c:cuentas) {
            if (c.getDniTitular().equals(identificacion)){
                return c;
            }
        }
        System.out.println("no coincide la identificancion");
        return null;
    }
    public static void agregarCuentas(Cuenta cuenta){
        cuentas.add(cuenta);
        System.out.println(cuentas.size());
    }
}
