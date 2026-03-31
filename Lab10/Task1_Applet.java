import java.applet.Applet;
import java.awt.Graphics;

public class Task1_Applet extends Applet {
    public void paint(Graphics g) {

        g.drawRect(50, 50, 150, 100);
        g.drawString("Прямоугольник", 60, 45);

        g.drawOval(250, 50, 100, 100);
        g.drawString("Круг", 270, 45);

        g.drawLine(50, 200, 200, 200);
        g.drawString("Линия", 90, 190);
    }
}