package input;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void reader() {
        final String path = "C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\memory.txt";
        File file = new File(path);
        try(FileReader reader = new FileReader(file)) {
            int num;
            while ((num= reader.read())!=-1){
                System.out.print((char) num);
            }
        } catch (IOException e){
            System.out.println("Файл не найден");
        }
    }
}