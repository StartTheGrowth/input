package input;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadLink {
    private static final String path = "D:\\JAVA\\input\\src\\main\\resources\\file.dat";

    public static void read() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            List<Link> links = (List<Link>) ois.readObject();
            if (links.isEmpty()) {
                System.out.println("No links found");
            } else {
                for (Link link : links) {
                    System.out.println(link);
                }
            }
        } catch (EOFException e) {
            System.out.println("Файл пуст");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при чтении файла " + e.getMessage());
        }
    }
}