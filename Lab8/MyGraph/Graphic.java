package MyGraph;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphic extends JFrame {

    Graphic(String s) {
        super(s);

        setLayout(null);
        setSize(200,400);
        setVisible(true);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        Button linear = new Button("y = kx");
        linear.setBounds(40,30,120,30);
        add(linear);

        Button parabola = new Button("y = 3x^2");
        parabola.setBounds(40,70,120,30);
        add(parabola);

        Button f3 = new Button("-x^2 + x^3");
        f3.setBounds(40,110,120,30);
        add(f3);

        Button f4 = new Button("x^3+x^2+x");
        f4.setBounds(40,150,120,30);
        add(f4);

        Button f5 = new Button("x^5");
        f5.setBounds(40,190,120,30);
        add(f5);

        Button sin = new Button("sin x");
        sin.setBounds(40,230,120,30);
        add(sin);

        Button cos = new Button("cos(x-1)+x");
        cos.setBounds(40,270,120,30);
        add(cos);

        linear.addActionListener(e -> new Linear("y=kx"));
        parabola.addActionListener(e -> new Parabola("y=3x^2"));
        f3.addActionListener(e -> new Func3("-x^2+x^3"));
        f4.addActionListener(e -> new Func4("x^3+x^2+x"));
        f5.addActionListener(e -> new Func5("x^5"));
        sin.addActionListener(e -> new Sinus("sin x"));
        cos.addActionListener(e -> new CosFunc("cos(x-1)+x"));
    }

    public static void main(String[] args) {
        new Graphic("Построитель графиков");
    }
}