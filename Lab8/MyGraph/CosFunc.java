package MyGraph;
import javax.swing.*;
import java.awt.*;

public class CosFunc extends JFrame{

    CosFunc(String s){
        super(s);
        setSize(600,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawLine(0,200,600,200);
        g.drawLine(300,0,300,400);

        g.setColor(Color.RED);

        for(int x=-300;x<300;x++){

            double y=Math.cos(x-1)*50 + x/5;

            g.drawLine(x+300,200-(int)y,x+300,200-(int)y);

        }
    }
}