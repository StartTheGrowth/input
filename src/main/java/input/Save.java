package input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
    private static Save save;

    private Save() {
    }

    public static Save getInstance() {
        if (save == null) {
            save = new Save();
        }
        return save;
    }

    public static void saver(int count, String str) {
        final String path = "C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\memory.txt";
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(count + ". " + str);
            writer.append("\n");
        } catch (IOException e) {
            System.out.println("Не удалось создать запись");
        }
    }
}