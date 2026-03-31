import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Task9_Swing extends JPanel {

    int x = 0, y = 0;

    public Task9_Swing() {
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 10, 10);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task9");
        f.add(new Task9_Swing());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}