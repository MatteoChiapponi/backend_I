package Models;

import java.util.ArrayList;

public class Ip {
    private String ip;
    private Integer primerOcteto;
    private Integer segundoOcteto;
    private Integer tercerOcteto;
    private Integer cuartoOcteto;

    public Ip(String ip) {
        this.ip = ip;
        asignarOctetos();
    }
    private void asignarOctetos(){
        String[] array = ip.split("\\.");
        primerOcteto= Integer.parseInt(array[0]);
        segundoOcteto= Integer.parseInt(array[1]);
        tercerOcteto= Integer.parseInt(array[2]);
        cuartoOcteto= Integer.parseInt(array[3]);
    }

    public Integer getPrimerOcteto() {
        return primerOcteto;
    }
}
