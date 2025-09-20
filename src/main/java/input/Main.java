package input;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CheckBegin checkBegin = new CheckBegin();
        Thread thread = new Thread(checkBegin);
        thread.start();
        thread.join();
        Thread thread1 = new Thread(new Save());
        if (checkBegin.isOk()) {
            thread1.start();
        }
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Window();
//            }
//        });
    }
}