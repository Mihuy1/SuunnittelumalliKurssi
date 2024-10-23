package Proxy;

import java.sql.Date;

public class ProxyDocument implements Document {
    private String content;
    private int id;
    private Date date;

    private AccessControlService accessControlService;


     public ProxyDocument(int id, Date date, String content, AccessControlService accessControlService) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.accessControlService = accessControlService;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Date getCreationDate() {
        return date;
    }

    @Override
    public String getContent(User user) {
        if (accessControlService.isAllowed(id, user)) {
            return content;
        } else {
            return "You do not have access to this document";
        }
    }


    
    
}
