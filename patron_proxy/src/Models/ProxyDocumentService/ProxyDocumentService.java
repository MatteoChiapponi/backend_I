package Models.ProxyDocumentService;

import Models.DocumentService;
import Models.Documento;
import Models.Usuario;

import java.util.ArrayList;

public class ProxyDocumentService implements getDocument{
    private DocumentService documentService;
    private ArrayList<Usuario> usuariosAutorizados;

    public ProxyDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }

    @Override
    public Documento getDocument(String url, String email) {
        usuariosAutorizados=documentService.getUsuariosAutorizados(url);
        if (usuariosAutorizados == null){
            System.out.println("no encontramos ningun documento en esa url");
            return null;
        }
        for (Usuario us:usuariosAutorizados) {
            if (us.getEmail().equals(email)){
                var documento = documentService.getDocument(url, email);
                return documento;
            }
        }
        System.out.println("no estas autorizado para ver el documento");
        return null;
    }


}
