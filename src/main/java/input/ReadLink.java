package input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadLink {
    public static void read() {
        final String path = "C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\file.dat";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Link link = (Link) ois.readObject();
            System.out.println(link);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error");
        }
    }
}