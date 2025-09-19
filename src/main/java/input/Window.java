package input;

import javax.swing.*;

public class Window {


    public Window() {
        JFrame frame = new JFrame("WINDOW");
        frame.setSize(200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World");
        frame.add(label);
        frame.setVisible(true);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window();
            }
        });
    }

}
