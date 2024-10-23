package Proxy;

import java.util.HashMap;

public class Library {
    HashMap<Integer, Document> HashMap = new HashMap<Integer, Document>();

    public void addDocument(Document document) {
        HashMap.put(document.getId(), document);
    }

    public Document getDocument(int documentId) {
        return HashMap.get(documentId);
    }
}
