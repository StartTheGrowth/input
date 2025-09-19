package input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadSecret {
    private String username;
    private int password;
    private Scanner scanner;
    private final File file = new File("C:\\Development\\JAVA\\SF\\Input\\src\\main\\resources\\secret.txt");

    public ReadSecret() {
        setSecret();
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    private void setSecret() {
        try {
            scanner = new Scanner(file);
            username = scanner.nextLine();
            password = scanner.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }
}
