import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");

        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            return;
        }

        int N = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= N) {
            sum += i;
            i++;
        }

        System.out.println("Сумма = " + sum);
    }
}