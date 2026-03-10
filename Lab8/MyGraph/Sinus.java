package MyGraph;
import javax.swing.*;
import java.awt.*;

public class Sinus extends JFrame{

    Sinus(String s){
        super(s);
        setSize(600,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawLine(0,200,600,200);
        g.drawLine(300,0,300,400);

        g.setColor(Color.BLUE);

        for(int x=0;x<600;x++){

            int y=(int)(80*Math.sin(Math.PI*x/180));

            g.drawLine(x,200-y,x,200-y);
        }
    }
}