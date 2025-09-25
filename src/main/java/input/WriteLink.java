package input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteLink {
    private static final String path = "D:\\JAVA\\input\\src\\main\\resources\\file.dat";

    public static void writerLink(int id, String name) {
        List<Link> links = readLink();
        links.add(new Link(id, name));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path, false))) {
            oos.writeObject(links);
        } catch (IOException e) {
            System.out.println("Неудачная попытка создания объекта");
        }
    }

    private static List<Link> readLink() {
        File file = new File(path);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Link>) ois.readObject();
        } catch (EOFException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при чтении" + e.getMessage());
            return new ArrayList<>();
        }
    }
}