import java.util.Scanner;

public class RectangleTask {

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ширину: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Ошибка: введите число!");
            return;
        }
        double width = sc.nextDouble();

        System.out.print("Введите высоту: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Ошибка: введите число!");
            return;
        }
        double height = sc.nextDouble();

        double area = rectangleArea(width, height);

        System.out.println("Площадь прямоугольника = " + area);
    }
}