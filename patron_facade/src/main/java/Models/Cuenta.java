package Models;

import Facade.FacadeImplementation;

public class Cuenta {
    Integer dniTitular;
    String contraseaña;
    Double saldo;
    FacadeImplementation facade;
    public Cuenta(Integer dniTitular, String contraseaña, Double saldo) {
        this.dniTitular = dniTitular;
        this.contraseaña = contraseaña;
        this.saldo = saldo;
        facade= new FacadeImplementation();
    }

    public Integer getDniTitular() {
        return dniTitular;
    }

    public String getContraseaña() {
        return contraseaña;
    }

    public Double getSaldo() {
        return saldo;
    }
    public void retirarDinero(Integer numIdentificacion, String contraseña, Double saldo){
        facade.retirarDinero(numIdentificacion,contraseña,saldo);
    }

}
