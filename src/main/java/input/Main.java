package input;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CheckBegin checkBegin = new CheckBegin();
        Menu menu  = new Menu();
        Thread thread = new Thread(checkBegin);
        thread.start();
        thread.join();

        if (checkBegin.isOk()) {
            menu.menu();
        }
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Window();
//            }
//        });
    }
}