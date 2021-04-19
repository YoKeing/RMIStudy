package RMI;

import java.io.Serializable;
import java.util.Date;

public class movie implements Serializable {
    private String name;
    private int length;
    private Date date;
    private int id;
    public movie(String name,int length,Date date,int id)
    {
        this.date=date;
        this.id=id;
        this.length=length;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public Date getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }
}
