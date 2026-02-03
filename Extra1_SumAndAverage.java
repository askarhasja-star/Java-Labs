import java.util.Scanner;

public class Extra1_SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double sum = a + b;
        double average = sum / 2;

        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}