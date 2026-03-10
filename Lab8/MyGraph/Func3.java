package MyGraph;
import javax.swing.*;
import java.awt.*;

public class Func3 extends JFrame{

    Func3(String s){
        super(s);
        setSize(600,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawLine(0,200,600,200);
        g.drawLine(300,0,300,400);

        g.setColor(Color.GREEN);

        for(int x=-150;x<150;x++){

            double y=(-x*x + x*x*x)/100;

            g.drawLine(x+300,200-(int)y,x+300,200-(int)y);

        }
    }
}