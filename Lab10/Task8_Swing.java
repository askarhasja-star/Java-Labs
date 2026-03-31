import javax.swing.*;
import java.awt.*;

public class Task8_Swing extends JPanel {

    int x = 0;

    public Task8_Swing() {
        new Timer(100, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        }).start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 100, 50, 50);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task8");
        f.add(new Task8_Swing());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}