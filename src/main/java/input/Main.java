package input;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CheckBegin checkBegin = new CheckBegin();
        Thread thread = new Thread(checkBegin);
        thread.start();
        thread.join();
        Thread thread1 = new Thread(new Hello());
        if (checkBegin.isOk()) {
            thread1.start();
        }
    }
}