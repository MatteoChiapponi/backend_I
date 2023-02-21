package Models;

import Models.ProxyDocumentService.getDocument;

import java.util.ArrayList;

public class DocumentService implements getDocument {
    private ArrayList<Documento> documentos;

    public DocumentService() {
        documentos = new ArrayList<>();
    }

    @Override
    public Documento getDocument(String url, String email) {
        for (Documento doc:documentos) {
            if (doc.getUrl().equals(url)) {
                System.out.println("enviando el el documento alojado en " + url + " al usuario registrado con el email " + email);
                return doc;
            }
        }
        return null;
    }
    public void addDocumento(Documento documento) {
        documentos.add(documento);
    }

    public ArrayList<Usuario> getUsuariosAutorizados(String url) {
        for (Documento doc:documentos){
            if (doc.getUrl().equals(url))
                return doc.getUsuariosAutorizados();
        }
        System.out.println("no encotramos los usuarios autorizados en la url " + url);
        return null;
    }
}
