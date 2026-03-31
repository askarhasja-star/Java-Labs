import javax.swing.*;
import java.awt.*;

public class Task6_Swing extends JFrame {

    public Task6_Swing() {
        JTextField tf = new JTextField(10);
        JButton btn = new JButton("OK");
        JLabel label = new JLabel("");

        btn.addActionListener(e -> {
            label.setText("Привет, " + tf.getText());
        });

        setLayout(new FlowLayout());
        add(tf);
        add(btn);
        add(label);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task6_Swing();
    }
}