import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] B = new int[15];
        int sum = 0;

        System.out.println("Введите 15 целых чисел:");

        for (int i = 0; i < 15; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                sc.next();
            }

            B[i] = sc.nextInt();

            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("Сумма положительных элементов = " + sum);
    }
}