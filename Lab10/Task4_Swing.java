import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task4_Swing extends JFrame {

    JLabel label;

    public Task4_Swing() {
        JButton btn = new JButton("Нажми");
        label = new JLabel("");

        btn.addActionListener(e -> label.setText("Кнопка нажата!"));

        setLayout(new FlowLayout());
        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task4_Swing();
    }
}