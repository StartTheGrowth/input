package input;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Save implements Runnable {
    private File file = new File(
            "C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\memory.txt");

    @Override
    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write(line);
                    writer.append("\n");
                } catch (IOException e) {
                    System.out.println("Не удалось сохранить запись");
                }
            }
        }
    }
}
