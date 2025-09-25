package input;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CheckBegin checkBegin = new CheckBegin();
        Menu menu = new Menu();
        checkBegin.run();

        if (checkBegin.isOk()) {
            menu.menu();
        }

    }
}