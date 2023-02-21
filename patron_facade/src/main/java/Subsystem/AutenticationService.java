package Subsystem;

import Models.Cuenta;

public class AutenticationService {

    public boolean validarUsuarioYContrasena(Integer identificacion, String contraseña, Cuenta cuenta){
        if (cuenta.getDniTitular() == identificacion && cuenta.getContraseaña().equals(contraseña))
            return true;
        else
            return false;
    }
}
