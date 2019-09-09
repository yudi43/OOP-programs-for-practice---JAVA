import javax.swing.*;
import java.awt.event.*;

public class SimpleGUI1 implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        SimpleGUI1 gui = new SimpleGUI1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click Me!");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked");
    }
}