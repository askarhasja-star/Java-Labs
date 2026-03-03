import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] B = new int[5][5];
        int[] A = new int[5];

        System.out.println("Введите 25 целых чисел для массива 5x5:");

        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {

                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число:");
                    sc.next();
                }

                B[i][j] = sc.nextInt();

                if (B[i][j] > 0)
                    sum += B[i][j];
            }
            A[i] = sum;
        }

        System.out.println("Суммы положительных по строкам:");
        for (int i = 0; i < 5; i++)
            System.out.println("Строка " + i + ": " + A[i]);
    }
}