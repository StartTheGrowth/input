package input;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private int numberLine = 0;
    private boolean isWork = true;

    public void menu() {
        System.out.println(
                "Выберите действие:" + "\n" + "save: Сохранить" +
                        "\n" + "read: Прочитать" +
                        "\n" + "...: Вернуться в меню" + "\n");
        while (isWork) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("save")) {
                    boolean checkCommand = false;
                    while (!checkCommand) {
                        System.out.println("Введите строку");
                        line = scanner.nextLine();
                        if (line.equals("return")) {
                            checkCommand = true;
                            menu();
                        } else {
                            numberLine++;
                            Save.saver(numberLine, line);
                        }
                    }
                } else if (line.equals("read")) {
                    Read.reader();
                } else if (line.equals("...")) {
                    menu();
                } else if (line.equals("exit")) {
                    isWork = false;
                } else {
                    System.out.println("Неверная команда ");
                }
            }
        }
    }
}