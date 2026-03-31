import javax.swing.*;
import java.awt.*;

public class Task5_Swing extends JFrame {

    int count = 0;
    JLabel label;

    public Task5_Swing() {
        JButton btn = new JButton("Click");
        label = new JLabel("0");

        btn.addActionListener(e -> {
            count++;
            label.setText("Нажатий: " + count);
        });

        setLayout(new FlowLayout());
        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task5_Swing();
    }
}