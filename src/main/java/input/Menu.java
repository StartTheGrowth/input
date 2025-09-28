package input;

import java.util.Scanner;

public class Menu {
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    private Scanner scanner;
    private boolean isWork = true;

    public void menu() {
        System.out.println(
                "Выберите действие:" +
                        "\n" + "save: Сохранить" +
                        "\n" + "read: Прочитать" +
                        "\n" + "return: Вернуться в меню" +
                        "\n" + "delete link: Удаление ссылки по номеру" +
                        "\n" + "delete all: Очистка всего списка" +
                        "\n" + "exit: Выход из программы");
        while (isWork) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("save")) {
                    boolean checkCommand = false;
                    while (!checkCommand) {
                        System.out.println("Введите ссылку");
                        line = scanner.nextLine();
                        if (line.equals("return")) {
                            checkCommand = true;
                            menu();
                        } else {
                            WriteLink.writerLink(line);
                        }
                    }
                } else if (line.equals("read")) {
                    ReadLink.read();
                } else if (line.equals("delete link")) {
                    System.out.println("Введите номер удаляемой ссылки");
                    if (scanner.hasNextInt()) {
                        int id = scanner.nextInt();
                        WriteLink.deleteOneLink(id);
                    } else {
                        System.out.println("Некорректный ввод");
                    }
                } else if (line.equals("delete all")) {
                    WriteLink.deleteAll();
                } else if (line.equals("exit")) {
                    isWork = false;
                } else {
                    System.out.println("Неверная команда ");
                }
            }
        }
    }
}