import java.util.Scanner;

public class Task4_NumberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int square = number * number;

        System.out.println("Квадрат числа: " + square);
    }
}