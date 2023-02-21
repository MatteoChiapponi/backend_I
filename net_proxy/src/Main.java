import Models.Cliente;
import Models.Ip;
import Models.Pelicula;
import Services.PeliculaService;
import Services.Proxys.ProxyPeliculaService;

public class Main {
    public static void main(String[] args) {
        Ip ip = new Ip("294.255.53.255");

        Cliente cliente = new Cliente("marcos",ip);

        Pelicula pelicula1 = new Pelicula("hola","www.hola.com");
        pelicula1.agregarPaisHabilitado("argentina");
        pelicula1.agregarPaisHabilitado("brasil");

        Pelicula pelicula2 = new Pelicula("chau","www.chau.com");
        pelicula2.agregarPaisHabilitado("argentina");
        pelicula2.agregarPaisHabilitado("colombia");

        PeliculaService peliculaService = new PeliculaService();
        peliculaService.agregarPel(pelicula1);
        peliculaService.agregarPel(pelicula2);

        ProxyPeliculaService proxyPeliculaService = new ProxyPeliculaService(peliculaService,cliente);
        System.out.println(proxyPeliculaService.getPelicula("chau").getUrl());
    }
}
