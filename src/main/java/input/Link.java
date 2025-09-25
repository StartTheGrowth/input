package input;

import java.io.Serial;
import java.io.Serializable;

public class Link implements Serializable {
    @Serial
    private static final long serialVersionUID = 0;
    private int id;
    private String name;

    public Link(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}