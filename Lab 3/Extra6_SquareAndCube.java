import java.util.Scanner;

public class Extra6_SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int square = n * n;
        int cube = n * n * n;

        System.out.println("Квадрат: " + square);
        System.out.println("Куб: " + cube);
    }
}