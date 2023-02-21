import Models.DocumentService;
import Models.Documento;
import Models.ProxyDocumentService.ProxyDocumentService;
import Models.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("matteo","mateo.chiapponi@gmail.com");
        Usuario usuario2 = new Usuario("leandro","leandro.chiapponi@gmail.com");

        Documento documento1= new Documento(1,"documento/importantes/alumnos.txt","todos los alumnos estan desaprobados");
        Documento documento2= new Documento(2,"documento/importantes/profesores.txt","todos los profesores estan despedidos");

        documento1.agregarUsuarioHabilitado(usuario1);
        documento2.agregarUsuarioHabilitado(usuario1);
        documento2.agregarUsuarioHabilitado(usuario2);

        DocumentService documentService = new DocumentService();
        documentService.addDocumento(documento1);
        documentService.addDocumento(documento2);

        ProxyDocumentService proxyDocumentService = new ProxyDocumentService(documentService);
        Documento documento = proxyDocumentService.getDocument("documento/importantes/profesores.txt","mateo.chiapponi@gmail.com");
        System.out.println(documento.getContenido());


    }
}
