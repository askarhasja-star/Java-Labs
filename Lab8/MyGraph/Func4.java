package MyGraph;
import javax.swing.*;
import java.awt.*;

public class Func4 extends JFrame{

    Func4(String s){
        super(s);
        setSize(600,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawLine(0,200,600,200);
        g.drawLine(300,0,300,400);

        g.setColor(Color.MAGENTA);

        for(int x=-150;x<150;x++){

            double y=(x*x*x + x*x + x)/100;

            g.drawLine(x+300,200-(int)y,x+300,200-(int)y);

        }
    }
}