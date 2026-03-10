package MyGraph;
import javax.swing.*;
import java.awt.*;

public class Linear extends JFrame {

    Linear(String s){
        super(s);
        setSize(600,400);
        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawLine(0,200,600,200);
        g.drawLine(300,0,300,400);

        g.setColor(Color.BLUE);

        for(double k=0.1;k<=1;k+=0.1){
            for(int x=-300;x<300;x++){
                double y=k*x/5;
                g.drawLine(x+300,200-(int)y,x+300,200-(int)y);
            }
        }
    }
}