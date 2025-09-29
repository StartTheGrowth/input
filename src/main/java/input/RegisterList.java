package input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RegisterList {
    public static void register(String name) {
        List<Link> linkList = new ArrayList<>();
        String path = "src\\main\\resources\\";
        String fileName = name + ".dat";
        File file = new File(path, fileName);
        try {
            FileWriter fileWriter = new FileWriter(file);
        } catch (IOException e) {
            System.out.println("Не удалось");
        }
    }
}
