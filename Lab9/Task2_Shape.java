import java.util.Scanner;

class Shape {
    double area() { return 0; }
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }

    double area() { return Math.PI * r * r; }
}

class Rectangle extends Shape {
    double a, b;
    Rectangle(double a, double b) { this.a = a; this.b = b; }

    double area() { return a * b; }
}

public class Task2_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Радиус: ");
        double r = sc.nextDouble();

        Shape s = new Circle(r);
        System.out.println("Площадь = " + s.area());
    }
}