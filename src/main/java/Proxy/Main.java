package Proxy;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        // Create the library
        Library library = new Library();

        // Create the access control service
        AccessControlService accessControlService = AccessControlService.getInstance();

        // Create users
        User user1 = new User("user1");
        User user2 = new User("user2");

        // Add allowed users to the access control service
        accessControlService.addAllowedUser("user1", 1); // user1 can access document with id 1

        // Create documents
        RealDocument unprotectedDocument = new RealDocument(2, new Date(System.currentTimeMillis()), "Unprotected Document Content");
        RealDocument protectedDocument = new RealDocument(1, new Date(System.currentTimeMillis()), "Protected Document Content");

        // Create proxy for the protected document
        ProxyDocument proxyDocument = new ProxyDocument(1, protectedDocument.getCreationDate(), protectedDocument.getContent(user1), accessControlService);

        // Add documents to the library
        library.addDocument(unprotectedDocument);
        library.addDocument(proxyDocument);

        // Access documents
        System.out.println("Unprotected Document Content: " + library.getDocument(2).getContent(user1));
        try {
            System.out.println("Protected Document Content (user1): " + library.getDocument(1).getContent(user1));
        } catch (Exception e) {
            System.out.println("Access Denied for user1 to document 1");
        }

        try {
            System.out.println("Protected Document Content (user2): " + library.getDocument(1).getContent(user2));
        } catch (Exception e) {
            System.out.println("Access Denied for user2 to document 1");
        }
    }
}