import javax.swing.*;
import java.awt.*;

public class Task10_Swing extends JPanel {

    String text = "";
    Color color = Color.RED;

    public Task10_Swing() {
        JTextField tf = new JTextField(10);
        JButton btn = new JButton("OK");

        btn.addActionListener(e -> {
            text = tf.getText();
            color = (color == Color.RED) ? Color.BLUE : Color.RED;
            repaint();
        });

        add(tf);
        add(btn);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        g.fillRect(100, 100, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString(text, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task10");
        f.add(new Task10_Swing());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}