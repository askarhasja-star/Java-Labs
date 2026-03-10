package MyGraph;
import javax.swing.*;
import java.awt.*;

public class Parabola extends JFrame{

    Parabola(String s){
        super(s);
        setSize(600,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawLine(0,200,600,200);
        g.drawLine(300,0,300,400);

        g.setColor(Color.RED);

        for(int x=-200;x<200;x++){

            double y=3*x*x/100;

            g.drawLine(x+300,200-(int)y,x+300,200-(int)y);

        }
    }
}