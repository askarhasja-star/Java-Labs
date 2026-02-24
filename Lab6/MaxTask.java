import java.util.Scanner;

public class MaxTask {

    // Для int
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Для double
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: нужно ввести целое число!");
            return;
        }
        int a = sc.nextInt();

        System.out.print("Введите второе целое число: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: нужно ввести целое число!");
            return;
        }
        int b = sc.nextInt();

        System.out.println("Максимум (int): " + max(a, b));

        // ----- Ввод double -----
        System.out.print("Введите первое дробное число: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число!");
            return;
        }
        double x = sc.nextDouble();

        System.out.print("Введите второе дробное число: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Ошибка: нужно ввести число!");
            return;
        }
        double y = sc.nextDouble();

        System.out.println("Максимум (double): " + max(x, y));
    }
}