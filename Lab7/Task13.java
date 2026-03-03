import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] C = new int[20];
        int sum = 0;

        System.out.println("Введите 20 целых чисел:");

        for (int i = 0; i < 20; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                sc.next();
            }

            C[i] = sc.nextInt();
            sum += C[i];
        }

        System.out.println("Среднее = " + (double) sum / 20);
    }
}