package input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadSecret {
    /**
     * Осуществляет чтение данных допуска в программу
     */
    private String username;
    private int password;
    private Scanner scanner;
    private final File file = new File(
            "C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\secret.txt");
    private boolean isReadFile = file.canRead();


    public boolean isReadFile() {
        return isReadFile;
    }

    public ReadSecret() {
        getSecret();
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    private void getSecret() {
        try {
            scanner = new Scanner(file);
            username = scanner.nextLine();
            password = scanner.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}