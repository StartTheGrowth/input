package input;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CheckBegin checkBegin = new CheckBegin();
        Thread thread = new Thread(checkBegin);
        thread.start();
        thread.join();
        Menu menu = Menu.getInstance();
        if (checkBegin.isOk()) {
            menu.menu();
        }
    }
}