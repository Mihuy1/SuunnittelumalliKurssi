package Proxy;

import java.util.HashMap;

public class AccessControlService {
    private HashMap<String, Integer> allowedUsers = new HashMap<String, Integer>();

    private static AccessControlService instance = null;

    public static AccessControlService getInstance() {
        if (instance == null)
            instance = new AccessControlService();
        
        return instance;
    }


    public boolean isAllowed(int documentId, User user) {
        for (String username : allowedUsers.keySet()) {
            if (username.equals(user.getUsername())) {
                if (allowedUsers.get(username) == documentId) {
                    return true;
                }
            }
        }

        return false;
    }

    public void addAllowedUser(String username, int documentId) {
        allowedUsers.put(username, documentId);
    }
}
