package input;

import javax.swing.*;

public class Window {
    private static JFrame frame = null;
    public static void window(){
        if (frame == null){
            frame = new JFrame("WINDOW");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            JLabel label = new JLabel("Hello World");
            label.setVisible(true);
            frame.add(label);
            frame.setVisible(true);
        }
    }

    public Window() {
        window();
    }
}