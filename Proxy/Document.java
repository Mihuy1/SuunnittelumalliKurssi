package Proxy;

import java.sql.Date;

public interface Document {
    public Date getCreationDate();
    public String getContent(User user);
    public int getId();    
}
