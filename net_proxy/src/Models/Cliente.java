package Models;

public class Cliente {
    private String nombre;
    private Ip ipCliente;

    public Cliente(String nombre, Ip ipCliente) {
        this.nombre = nombre;
        this.ipCliente = ipCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Ip getIpCliente() {
        return ipCliente;
    }
}
