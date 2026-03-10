package MyGraph;
import javax.swing.*;
import java.awt.*;

public class Func5 extends JFrame{

    Func5(String s){
        super(s);
        setSize(600,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawLine(0,200,600,200);
        g.drawLine(300,0,300,400);

        g.setColor(Color.ORANGE);

        for(int x=-100;x<100;x++){

            double y=(Math.pow(x,5))/100000;

            g.drawLine(x+300,200-(int)y,x+300,200-(int)y);

        }
    }
}