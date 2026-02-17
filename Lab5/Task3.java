import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");

        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            return;
        }

        int N = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }

        System.out.println("Факториал = " + factorial);
    }
}