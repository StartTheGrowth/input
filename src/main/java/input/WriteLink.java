package input;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteLink {
    public static void writerLink(int id, String name) {
        Link link = new Link(id, name);
        final String path = "C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\file.dat";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path, true))) {
            oos.writeObject(link);
        } catch (IOException e) {
            System.out.println("Неудачная попытка создания объекта");
        }
    }
}