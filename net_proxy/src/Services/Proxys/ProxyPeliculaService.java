package Services.Proxys;

import Models.Cliente;
import Models.Pelicula;
import Services.PeliculaService;
import Services.VerPelicula;

import java.util.ArrayList;

public class ProxyPeliculaService implements VerPelicula {
    private PeliculaService peliculaService;
    private Cliente cliente;

    public ProxyPeliculaService(PeliculaService peliculaService, Cliente cliente) {
        this.peliculaService = peliculaService;
        this.cliente = cliente;
    }

    @Override
    public Pelicula getPelicula(String nombrePelicula) {
        String paisCliente = "";
        ArrayList<String> paisesHabilitados = peliculaService.obtenerPaisesHabilitados(nombrePelicula);
        Pelicula pelicula;

        if (cliente.getIpCliente().getPrimerOcteto()<50)
            paisCliente= "argentina";
        else if (cliente.getIpCliente().getPrimerOcteto()<100)
            paisCliente="brasil";
        else if (cliente.getIpCliente().getPrimerOcteto()<150)
            paisCliente="colombia";

        for (String pais:paisesHabilitados) {
            if (paisCliente.equals(pais)){
               pelicula = peliculaService.getPelicula(nombrePelicula);
               return pelicula;
            }
        }
        System.out.println("no tenes acceso a esa pelicula");
        return null;
    }

}
