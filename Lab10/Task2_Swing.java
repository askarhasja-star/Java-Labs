import javax.swing.*;
import java.awt.*;

public class Task2_Swing extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.drawLine(50, 200, 200, 200);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task2");
        f.add(new Task2_Swing());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}