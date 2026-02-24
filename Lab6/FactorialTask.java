import java.util.Scanner;

public class FactorialTask {

    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Факториал отрицательного числа не определён.");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            return;
        }

        int number = sc.nextInt();
        long result = factorial(number);

        if (result != -1) {
            System.out.println("Факториал числа " + number + " = " + result);
        }
    }
}