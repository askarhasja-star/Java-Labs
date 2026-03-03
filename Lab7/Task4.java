import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Введите верхнюю границу: ");

        while (!sc.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число:");
            sc.next();
        }

        N = sc.nextInt();

        if (N < 0) {
            System.out.println("Число должно быть положительным.");
            return;
        }

        System.out.println("Чётные числа:");
        for (int i = 0; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}