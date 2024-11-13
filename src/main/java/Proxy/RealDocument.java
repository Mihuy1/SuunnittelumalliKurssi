package Proxy;

import java.sql.Date;

public class RealDocument implements Document {
    private Date date;
    private int id;
    private String content;

    public RealDocument(int id, Date date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
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
        return content;
    }
}
