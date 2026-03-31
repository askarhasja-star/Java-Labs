import javax.swing.*;
import java.awt.*;

public class Task3_Swing extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.drawString("Hello Java Swing", 100, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Task3");
        f.add(new Task3_Swing());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}