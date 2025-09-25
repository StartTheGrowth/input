package input;

import java.util.Scanner;

public class CheckBegin /*implements Runnable*/ {
    /**
     * Проверяет соответствие имени пользователя и пароля,
     * вводимых в консоль
     */
    private final ReadSecret readSecret = new ReadSecret();
    private final String USERNAME = readSecret.getUsername();
    private final int PASSWORD = readSecret.getPassword();
    private Scanner scan;
    private int count = 3;
    private volatile boolean isOk;
    private boolean isContinue = true;

    public boolean isOk() {
        return isOk;
    }

    public void input() {
        String inUsername;
        int inPass;
        while (!isOk && isContinue) {
            System.out.println("Введите имя пользователя");
            scan = new Scanner(System.in);
            inUsername = scan.nextLine();
            System.out.println("Введите пароль");
            if (scan.hasNextInt()) {
                inPass = scan.nextInt();
                if (check(inUsername, inPass)) {
                    System.out.println("Добро пожаловать " + USERNAME);
                    isOk = true;
                } else {
                    count--;
                    if (count == 0) {
                        System.out.println("Попытки закончились");
                        isContinue = false;
                    } else {
                        System.out.println("Неверный ввод. Осталось попыток входа " + count);
                        input();
                    }
                }
            } else {
                System.out.println("Некорректный ввод пароля. Пароль должен состоять из цифр");
                input();
            }
        }
    }

    private boolean check(String username, int pass) {
        return username.equals(USERNAME) && pass == PASSWORD && count != 0;
    }

   // @Override
    public void run() {
        if (readSecret.isReadFile()) {
            input();
        } else {
            System.out.println("Доступ невозможен");
        }
    }
}