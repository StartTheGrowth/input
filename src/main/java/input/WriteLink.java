package input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteLink {
    private static final String path = "C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\file.dat";

    public static void writerLink(String name) {
        List<Link> links = readLink();
        links.add(new Link(name));
        reNumberingOfLinks(links);
        writerObject(links);
    }

    public static void deleteOneLink(int id) {
        List<Link> links = readLink();
        if (id > links.size() || id <= 0) {
            System.out.println("Указана несуществующая строка");
        } else {
            links.remove(id - 1);
            reNumberingOfLinks(links);
            writerObject(links);
            System.out.println("Ссылка " + id + " удалена");
        }
    }

    public static void deleteAll() {
        List<Link> links = readLink();
        links.removeAll(links);
        writerObject(links);
        System.out.println("Список очищен");
    }

    private static void writerObject(List<Link> links) {
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

    private static void reNumberingOfLinks(List<Link> links) {
        int numberOfLine = 0;
        for (Link link : links) {
            numberOfLine++;
            link.setId(numberOfLine);
        }
    }
}